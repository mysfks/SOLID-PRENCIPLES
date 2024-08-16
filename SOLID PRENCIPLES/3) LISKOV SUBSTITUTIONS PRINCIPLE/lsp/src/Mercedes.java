public class Mercedes extends Arabalar implements Turbo {

    Mercedes(){
        setHizlanma(30);
    }

    @Override
    void calistir() {
        setHiz(getHiz()+getHizlanma());
    }

    @Override
    public void turboAcik() {
        setHizlanma(getHizlanma()*2);
    }
}