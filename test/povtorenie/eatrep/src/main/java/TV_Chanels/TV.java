package TV_Chanels;

public class TV {
    private final static TV instance;
    private Chanel tv[];
    int countChanels = 0;

    private TV() {
        tv = new Chanel[5];
    }
    static{
        instance = new TV();
    }

    public Chanel[] getTv() {
        return tv;
    }

    public static TV getInstance(){
        return instance;
    }


    public int getCountChanels() {
        return countChanels;
    }

    public void addChanel(Chanel chanel){
        if (countChanels<tv.length){
            tv[countChanels] = chanel;
            countChanels++;
        }else System.out.println("Память телевизора переполнена");
    }

    public void watchCurrentChanel(int numberChanel){
        Chanel chanels[] = this.getTv();
        chanels[numberChanel].showCurrentTimeShow();
    }
}
