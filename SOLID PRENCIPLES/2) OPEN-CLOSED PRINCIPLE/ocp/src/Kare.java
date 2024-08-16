public class Kare extends Sekil implements Alan, Cevre {
    private double kenar;

    Kare(double _kenar){
        this.kenar=_kenar;
    }

    public double getKenar() {return kenar;}
    public void setKenar(double _kenar) {this.kenar = _kenar;}

    @Override
    public double alanHesapla() {
        return getKenar()*getKenar();
    }

    @Override
    public double cevreHesapla() {
        return 4*getKenar();
    }
}