/*
    SINGLE RESPONSIBILITY PRINCIPLE
        --->> Bu prensip bize her sınıfın kendi yapması gereken işlemleri yapmasını istiyor. Öreneğin, bir araba sınıfında bulunan
        araba ile ilgili metodlar dışında bir metod ya da metodlar varsa bu prensibe aykırı bir durumda olmuş oluyor. Bu sayade
        okunulabilirlik artar ve karmaşıklık azalır...
*/

/*
    Tek Sorumluluk Prensibinde, uygulamamızda kullanıcıların oludğu bir sistemde kullanıcılar sisteme hem giriş hem de çıkış 
  yapabilsin. Bu uygulamayı SRP ile yapıldı...
*/

public class App {
    public static void main(String[] args) throws Exception {
        Kullanici kullanici = new  Kullanici("Ali", "Can", "5516165");
        Islemler islem = new Islemler();
            islem.girisYap(kullanici);
    }
}