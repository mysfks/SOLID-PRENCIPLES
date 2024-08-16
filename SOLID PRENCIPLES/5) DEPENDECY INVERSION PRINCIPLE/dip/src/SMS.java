public class SMS implements Bildirim {

    @Override
    public void gonder(Kullanici kullanici, Bilgi bilgi) {
        System.out.println(kullanici.getAd() + " kisisine SMS ile " + "(" + bilgi.getMesaj() + ")" + " mesaji gonderildi.");
    }
}