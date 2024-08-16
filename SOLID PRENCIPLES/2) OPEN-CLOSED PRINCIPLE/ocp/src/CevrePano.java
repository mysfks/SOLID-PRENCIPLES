import java.util.ArrayList;

public class CevrePano implements Pano{

    @Override
    public double hesapla(ArrayList<Sekil> sekiller) {
        double toplam=0;
            for(Sekil sekil : sekiller){
                if(sekil instanceof Cevre){
                    toplam+=((Cevre)sekil).cevreHesapla();
                }
            }
            return toplam;
    }
}