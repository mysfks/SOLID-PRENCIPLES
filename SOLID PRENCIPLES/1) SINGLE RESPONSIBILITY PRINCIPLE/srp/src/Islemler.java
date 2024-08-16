public class Islemler {

    Islemler() {
        Kullanici _kullanici = new Kullanici(null, null, null);
        _kullanici.getIsim();
    }

    void girisYap(Kullanici _kullanici) {
        System.out.println("Sisteme Giris Yaptınız...");
    }

    void cikisYap(Kullanici _kullanici) {
        System.out.println("Sistemden Cikis Yapiliyor...");
    }
}