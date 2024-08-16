/*
    DEPENDENCY INVERSION PRENCIPLE
        --->> Bu prensipte alt sınıflarda yapılan herhangi bir değişiklik üst sınıfları etkilememelidir. Alt seviyeli sınıflar, temel 
        işlemleri yapan sınıflar olarak söylenebilir. Üst seviyeli sınıflar ise programın ne yapacağını tanımlayan sınıflardır. Bu 
        prensip bu sınıflar arasındaki bağımlılık kaldırmayı hedefler...
*/

/*
    Dependency Inversion Prensibinde, bir bildirim uygulaması geliştirilmek isteniyor. Sistemde kullanıcılar ve kullanıcılara ait
  isim, mail, ip ve telefon numaraları bulunmaktadır. Kullanıcılar bir bilgi gönderileceği zaman isteğe bağlı olarak mail ya da ip 
  adresi üzerinden gönderim yapılabiliyor. DIP'e göre uygulama yapıldı...
*/

public class App {
    public static void main(String[] args) throws Exception {
        Kullanici kullanici1 = new Kullanici("Ali");
        BildirimGonder bildirim =new BildirimGonder();

        Mail mail = new Mail();
        IP ip = new IP();
        SMS sms = new SMS();

        kullanici1.ekle(ip);
        kullanici1.ekle(mail);
        kullanici1.ekle(sms);

        Bilgi bilgi = new Bilgi();
            bilgi.setMesaj("Naber Fıstık :)");

        bildirim.bildirimGonder(kullanici1, bilgi);
    }
}