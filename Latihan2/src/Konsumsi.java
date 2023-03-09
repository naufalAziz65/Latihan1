public class Konsumsi <M, I>{
    private M m;
    private I i;

    public M getM(){
        return m;
    }
    public I getI(){
        return i;
    }

    public void setkonsumsi(M makanan, I minuman){
        this.m = makanan;
        this.i = minuman;
    }

}
