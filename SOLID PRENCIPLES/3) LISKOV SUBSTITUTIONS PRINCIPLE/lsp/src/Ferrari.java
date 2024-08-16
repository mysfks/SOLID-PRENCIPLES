public class Ferrari extends Arabalar implements Turbo, Klima {

    Ferrari(){
        setHizlanma(60);
    }

    @Override
    void calistir() { 
        setHiz(getHiz()+getHizlanma());
    }

    @Override
    public void klimaAcik() {
        setHizlanma(getHizlanma()*0.9);
    }

    @Override
    public void turboAcik() {
        setHizlanma(getHizlanma()*2);
    }
}