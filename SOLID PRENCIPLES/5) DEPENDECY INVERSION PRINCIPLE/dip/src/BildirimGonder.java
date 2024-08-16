public class BildirimGonder {
    public void bildirimGonder(Kullanici kullanici, Bilgi bilgi){
        for(Bildirim bildirim : kullanici.getBildirimler()){
            bildirim.gonder(kullanici, bilgi);
        }
    }
}