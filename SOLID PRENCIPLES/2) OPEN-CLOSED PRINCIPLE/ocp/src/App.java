/*
    OPEN - CLOSED PRINCIPLE
        --->> Değişime açık ama gelişime kapalı kodlar yazmayı hedefler. Yani uygulamaya yeni bir yapı eklenmesi gereken bir durum 
        olduğunda yeni kodlar yazılacak ama var olan kod değiştirilmeyecek...
*/

/*
    Open-Closed Prensibinde, farklı şekillerin alan ve çevrelerini hesaplayan ve bu hesaplanan değerlerin toplamını
  ayrı ayrı bize gösteren bir uygulama yapıldı...
        --->> Burada farklı şekiller eklenmesine karşılık kodda değişiklik yapıldı ama yeni kodlar eklenmedi.
*/

import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        AlanPano aPano = new AlanPano();
        CevrePano cPano = new CevrePano();

        Kare kare1 = new Kare(8);
        Dikdortgen dik1 = new Dikdortgen(12, 6);

        ArrayList<Sekil> sekiller = new ArrayList<Sekil>();
            sekiller.add(kare1);
            sekiller.add(dik1);

            System.out.println("Alanlar Toplami ---->> " + aPano.hesapla(sekiller));
            System.out.println("Cevreler Toplami ---->> " + cPano.hesapla(sekiller));
    }
}