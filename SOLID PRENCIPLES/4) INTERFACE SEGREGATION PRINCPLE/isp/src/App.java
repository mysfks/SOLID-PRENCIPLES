/*
    INTERFACE SEGREGATION PRINCIPLE
        --->> Bu prensipte sınıfların bir arayüzde bulunan fonksiyonları kullanmak istemeyebilir. Bu yüzden arayüzleri yeteri kadar
        çoğaltmak mantıklı olabilir. Bir arayüze çok fazla yetenek yüklenirse sınıflar iiçin sıkıntılı durumlar ortaya çıkabilir.
*/

/*
    Arayüz Ayrıştırma Prensibinde, sisteme girmesi ve çıkması için kullanıcı bulunurken, sisteme sadece girmesi için bir admin 
  bulunmaktadır. Bu uygulama ISP ile yapıldı...
        --->> Aslında bu prensip bir önceki prensipte (LSP) kısmen de olsa uygulanmış oluyor...
*/

public class App {
    public static void main(String[] args) throws Exception {
        Kullanici kullanici = new Kullanici(null, null, null);
        Admin admin = new Admin(null, null, null, null);
            kullanici.girisYap(kullanici);
            admin.girisYap(kullanici);
            kullanici.cikisYap(kullanici);
    }
}