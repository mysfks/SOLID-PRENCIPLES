public class BMW extends Arabalar implements Klima {

    BMW(){
        setHizlanma(40);
    }

    @Override
    void calistir() {
        setHiz(getHiz()+getHizlanma());
    }

    @Override
    public void klimaAcik() {
        setHizlanma(getHizlanma()*0.9);
    }
}