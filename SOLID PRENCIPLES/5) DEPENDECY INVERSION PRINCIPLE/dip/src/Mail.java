public class Mail implements Bildirim {
    
    @Override
    public void gonder(Kullanici kullanici, Bilgi bilgi) {
        System.out.println(kullanici.getAd() + " kisisine Mail ile " + "(" + bilgi.getMesaj() + ")" + " mesaji gonderildi.");
    }
}