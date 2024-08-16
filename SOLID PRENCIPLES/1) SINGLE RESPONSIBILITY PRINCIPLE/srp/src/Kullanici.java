public class Kullanici {
    private String isim;
    private String soyisim;
    private String sifre;

    Kullanici(String _isim, String _soyisim, String _sifre){
        this.isim=_isim;
        this.soyisim=_soyisim;
        this.sifre=_sifre;
    }

    public String getIsim() {return isim;}
    public void setIsim(String isim) {this.isim = isim;}
    public String getSoyisim() {return soyisim;}
    public void setSoyisim(String soyisim) {this.soyisim = soyisim;}
    public String getSifre() {return sifre;}
    public void setSifre(String sifre) {this.sifre = sifre;}
}