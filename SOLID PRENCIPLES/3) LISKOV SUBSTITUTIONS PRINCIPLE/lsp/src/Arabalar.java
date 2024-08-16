public abstract class Arabalar{
    private double hiz;
    private double hizlanma;

    Arabalar(){
        setHiz(0);
    }

    public double getHiz() {return hiz;}
    public void setHiz(double _hiz) {this.hiz = _hiz;}
    public double getHizlanma() {return hizlanma;}
    public void setHizlanma(double _hizlanma) {this.hizlanma = _hizlanma;}

    abstract void calistir();
}