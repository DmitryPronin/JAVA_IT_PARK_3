import java.util.Random;
class Program{
    public static void main(String[] args) {
        int[] arr = new int[1000];
        int i;
        int sum1 = 0;
        int sum2 = 0;
        for (i = 0; i<1000; i++){
            arr[i] = i + 1;
            sum1 = sum1 + arr[i];
        }
        Random rand = new Random();
        int delElem = rand.nextInt(1000);
        arr[delElem] = 0;
        System.out.println(delElem);
        for (i= 0; i<1000; i++){
            sum2 = sum2 + arr[i];
        }
        int rez = sum1 - sum2;
        System.out.println("System delete from array number :" + rez);

    }
}