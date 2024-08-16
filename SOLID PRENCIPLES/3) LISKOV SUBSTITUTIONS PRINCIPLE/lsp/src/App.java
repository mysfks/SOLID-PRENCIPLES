/*
    LISKOV SUBSTITUTIONS PRONCIPLE
        -->> Liskov diyor ki, ana sınıftan miras alan diğer sınıflar ana sınıfta bulunan bazı metodları kullanmak istemeyebilir.
        Yani diğer sınıfların kullanmayacağı metodlar sınıf içierisinde bulunmasın. Bunun çözümü için de arayüzler kullanılabilir.
*/

/*
    Liskov Substitutions Prensibinde, farklı model arabalarda bulunan klima ve turbo özelliklerinin açık veya kapalı olması durumunda
  aracın hızı etklemesi üzerine bir uygulama yapıldı...
        --->> Mercedes (Turbo var, Klima yok), Ferrari (Turbo var, Klima var), BMW (Turbo yok, Klima var)
        --->> Kliması açık olan araçların hızlanması %10 azalırken, turbosu açık olan aracın hızlanması 2 katına çıkmaktadır.
*/
public class App {
    public static void main(String[] args) throws Exception {
        Ferrari ferrari = new Ferrari();
            ferrari.calistir();
            ferrari.turboAcik();
                System.out.println("Ferrari Hizi ---->> " + ferrari.getHizlanma());

        BMW bmw = new BMW();
            bmw.calistir();
            bmw.klimaAcik();
                System.out.println("BMW Hizi ---->> " + bmw.getHizlanma());
    }
}