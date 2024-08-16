public class Dikdortgen extends Sekil implements Alan, Cevre {
    private double kisaKenar;
    private double uzunKenar;

    Dikdortgen(double _kisaKenar, double _uzunKenar){
        this.kisaKenar=_kisaKenar;
        this.uzunKenar=_uzunKenar;
    }

    public double getKisaKenar() {return kisaKenar;}
    public void setKisaKenar(double _kisaKenar) {this.kisaKenar = _kisaKenar;}
    public double getUzunKenar() {return uzunKenar;}
    public void setUzunKenar(double _uzunKenar) {this.uzunKenar = _uzunKenar;}

    @Override
    public double alanHesapla() {
        return getKisaKenar()*getUzunKenar();
    }

    @Override
    public double cevreHesapla() {
        return 2*getKisaKenar()+2*getUzunKenar();
    }
}