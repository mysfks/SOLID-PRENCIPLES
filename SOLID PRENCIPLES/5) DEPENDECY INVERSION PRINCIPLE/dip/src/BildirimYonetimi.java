import java.util.ArrayList;

public class BildirimYonetimi {
    ArrayList<Bildirim> bildirimler;

    BildirimYonetimi(){
        bildirimler = new ArrayList<>();
    }

    public void ekle(Bildirim bildirim){
        bildirimler.add(bildirim);
    }

    public ArrayList<Bildirim> getBildirimler() {return bildirimler;}
}