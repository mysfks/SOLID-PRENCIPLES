public class Kullanici extends BildirimYonetimi {
    private String ad;
    private String soyad;
    private String mail;
    private String ip;
    private String telNo;

    public Kullanici(String _ad) {
        this.ad=_ad;
    }

    public String getAd() {return ad;}
    public void setAd(String ad) {this.ad = ad;}
    public String getSoyad() {return soyad;}
    public void setSoyad(String soyad) {this.soyad = soyad;}
    public String getMail() {return mail;}
    public void setMail(String mail) {this.mail = mail;}
    public String getIp() {return ip;}
    public void setIp(String ip) {this.ip = ip;}
    public String getTelNo() {return telNo;}
    public void setTelNo(String telNo) {this.telNo = telNo;}
}