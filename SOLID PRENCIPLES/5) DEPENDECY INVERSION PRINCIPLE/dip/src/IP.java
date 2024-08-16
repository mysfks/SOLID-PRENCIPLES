public class IP implements Bildirim {

    @Override
    public void gonder(Kullanici kullanici, Bilgi bilgi) {
        System.out.println(kullanici.getAd() + " kisisine IP ile " + "(" + bilgi.getMesaj() + ")" + " mesaji gonderildi.");
    }
}