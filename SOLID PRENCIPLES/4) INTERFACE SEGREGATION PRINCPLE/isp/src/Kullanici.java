public class Kullanici implements GirisIslemi, CikisIslemi{
    private String ad;
    private String soyad;
    private String kullaniciAdi;

    Kullanici(String _ad, String _soyad, String _kullaniciAdi) {
        this.ad = _ad;
        this.soyad = _soyad;
        this.kullaniciAdi = _kullaniciAdi;
    }

    public String getAd() {return ad;}
    public void setAd(String ad) {this.ad = ad;}
    public String getSoyad() {return soyad;}
    public void setSoyad(String soyad) {this.soyad = soyad;}
    public String getKullaniciAdi() {return kullaniciAdi;}
    public void setKullaniciAdi(String kullaniciAdi) {this.kullaniciAdi = kullaniciAdi;}

    @Override
    public void cikisYap(Kullanici _kullanici) {
        System.out.println(_kullanici.getAd() + "Sistemden Cikiliyor...");
    }

    @Override
    public void girisYap(Kullanici _kullanici) {
        System.out.println(_kullanici.getAd() + "Sisteme Giriliyor...");
    }
}