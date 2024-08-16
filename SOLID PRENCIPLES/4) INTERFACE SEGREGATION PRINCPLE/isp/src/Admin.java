public class Admin implements GirisIslemi{
    private String ad;
    private String soyad;
    private String kullaniciAdi;
    private String ipAdresi;

    Admin(String _ad, String _soyad, String _kullaniciAdi, String _ipAdresi) {
        this.ad = _ad;
        this.soyad = _soyad;
        this.kullaniciAdi = _kullaniciAdi;
        this.ipAdresi = _ipAdresi;
    }

    public String getIpAdresi() {return ipAdresi;}
    public void setIpAdresi(String ipAdresi) {this.ipAdresi = ipAdresi;}

    @Override
    public void girisYap(Kullanici _kullanici) {
        System.out.println(_kullanici.getAd() + "Sisteme Giriliyor...");
    }
}