import java.util.ArrayList;

public class AlanPano implements Pano{

    @Override
    public double hesapla(ArrayList<Sekil> sekiller) {
        double toplam=0;
            for(Sekil sekil : sekiller){
                if(sekil instanceof Alan){
                    toplam+=((Alan)sekil).alanHesapla();
                }
            }
            return toplam;
    }
}