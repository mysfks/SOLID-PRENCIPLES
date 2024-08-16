# SOLID Principles in Object-Oriented Design

## Introduction

SOLID is a mnemonic acronym that stands for five design principles intended to make object-oriented designs more understandable, flexible, and maintainable. These principles are:

1. **S** - Single Responsibility Principle (SRP)
2. **O** - Open/Closed Principle (OCP)
3. **L** - Liskov Substitution Principle (LSP)
4. **I** - Interface Segregation Principle (ISP)
5. **D** - Dependency Inversion Principle (DIP)

## 1. Single Responsibility Principle (SRP)
**Definition:** A class should have only one reason to change, meaning it should have only one job or responsibility.

**Explanation:** Each class should focus on a single task or responsibility. If a class has more than one responsibility, those responsibilities become coupled. A change to one responsibility may affect the other, leading to fragile and hard-to-maintain code.

**Example:**
```python
# Bad Example: Violating SRP
class User:
    def __init__(self, username, password):
        self.username = username
        self.password = password

    def save_to_database(self):
        # Code to save user to the database

    def send_welcome_email(self):
        # Code to send a welcome email

# Good Example: Following SRP
class User:
    def __init__(self, username, password):
        self.username = username
        self.password = password

class UserRepository:
    def save(self, user):
        # Code to save user to the database

class EmailService:
    def send_welcome_email(self, user):
        # Code to send a welcome email
```

## 2. Open/Closed Principle (OCP)
**Definition:** Software entities (classes, modules, functions, etc.) should be open for extension but closed for modification.

**Explanation:** You should be able to add new functionality to an existing class without changing its existing code. This promotes code stability and reduces the risk of introducing new bugs.

**Example:**
```python
# Bad Example: Violating OCP
class Rectangle:
    def __init__(self, width, height):
        self.width = width
        self.height = height

    def area(self):
        return self.width * self.height

class AreaCalculator:
    def calculate(self, shape):
        if isinstance(shape, Rectangle):
            return shape.area()
        # Adding a new shape would require modifying this class

# Good Example: Following OCP
class Shape:
    def area(self):
        pass

class Rectangle(Shape):
    def __init__(self, width, height):
        self.width = width
        self.height = height

    def area(self):
        return self.width * self.height

class Circle(Shape):
    def __init__(self, radius):
        self.radius = radius

    def area(self):
        return 3.14 * self.radius * self.radius

class AreaCalculator:
    def calculate(self, shape):
        return shape.area()
```

## 3. Liskov Substitution Principle (LSP)
**Definition:** Objects of a superclass should be replaceable with objects of a subclass without affecting the correctness of the program.

**Explanation:** If class B is a subclass of class A, then we should be able to replace A with B without disrupting the behavior of our program. This principle ensures that a subclass can stand in for its superclass.


**Example:**
```python
# Bad Example: Violating LSP
class Bird:
    def fly(self):
        pass

class Penguin(Bird):
    def fly(self):
        raise Exception("Penguins can't fly")

# Good Example: Following LSP
class Bird:
    def move(self):
        pass

class Sparrow(Bird):
    def move(self):
        print("Flying")

class Penguin(Bird):
    def move(self):
        print("Swimming")
```

## 4. Interface Segregation Principle (ISP)
**Definition:** A client should not be forced to implement an interface it doesn't use.

**Explanation:** Instead of one large interface, we should break it down into smaller, more specific ones so that clients only need to know about the methods that are of interest to them. This prevents "fat" interfaces.

**Example:**
```python
# Bad Example: Violating ISP
class WorkerInterface:
    def work(self):
        pass

    def eat(self):
        pass

class Worker(WorkerInterface):
    def work(self):
        # Working code

    def eat(self):
        # Eating code

class Robot(WorkerInterface):
    def work(self):
        # Working code

    def eat(self):
        raise NotImplementedError("Robots don't eat")

# Good Example: Following ISP
class Workable:
    def work(self):
        pass

class Eatable:
    def eat(self):
        pass

class Worker(Workable, Eatable):
    def work(self):
        # Working code

    def eat(self):
        # Eating code

class Robot(Workable):
    def work(self):
        # Working code
```


## 5. Dependency Inversion Principle (DIP)
**Definition:** High-level modules should not depend on low-level modules. Both should depend on abstractions. Abstractions should not depend on details; details should depend on abstractions.

**Explanation:** The principle emphasizes that a class should depend on abstractions (interfaces) rather than concrete classes. This promotes loose coupling between classes.


**Example:**
```python
# Bad Example: Violating DIP
class LightBulb:
    def turn_on(self):
        pass

    def turn_off(self):
        pass

class Switch:
    def __init__(self, bulb: LightBulb):
        self.bulb = bulb

    def operate(self):
        self.bulb.turn_on()

# Good Example: Following DIP
class Switchable:
    def turn_on(self):
        pass

    def turn_off(self):
        pass

class LightBulb(Switchable):
    def turn_on(self):
        pass

    def turn_off(self):
        pass

class Switch:
    def __init__(self, device: Switchable):
        self.device = device

    def operate(self):
        self.device.turn_on()
```

## Conclusion
The SOLID principles are essential for creating maintainable, scalable, and flexible software. By adhering to these principles, developers can avoid common pitfalls in object-oriented design, leading to a codebase that is easier to understand, extend, and maintain.
