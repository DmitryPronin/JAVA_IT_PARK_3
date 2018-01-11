import java.util.Scanner;

public class Bankomat {
    public static void main(String[] args) {
        System.out.println("Введите сумму для снятия");
        Scanner scanner = new Scanner(System.in);
        int sumOut = scanner.nextInt();

        int col_5000= sumOut / 5000;
        int temp = sumOut % 5000;
        int col_1000 = temp / 1000;
        temp = temp % 1000;
        int col_500 = temp / 500;
        temp = temp % 500;
        int col_100 = temp / 1000;
        temp = temp % 100;
        int col_50 = temp / 50 ;
        temp = temp % 50;
        int col_10 = temp / 10;
        temp = temp %10;
        int col_5 = temp / 5 ;
        temp = temp %5;
        int col_2 = temp / 2 ;
        temp = temp /1;
        int col_1 = temp /1;

//        System.out.println("5000 купюр = " + col_5000 );
//        System.out.println("1000 купюр = " + col_1000 );
//        System.out.println("500 купюр = " + col_500 );
//        System.out.println("100 купюр = " + col_100 );
//        System.out.println("50 купюр = " + col_50 );
//        System.out.println("10 купюр = " + col_10 );
//        System.out.println("5 монет = " + col_5 );
//        System.out.println("2 монет = " + col_2 );
//        System.out.println("1 монет = " + col_1 );

        int banknots [] = {5000,1000,500,100,50,10,5,2,1};
        int tempForArray = sumOut;
        for (int kupura: banknots){

            System.out.println(kupura + " купюр " + tempForArray / kupura);
            tempForArray = tempForArray % kupura;
        }


    }
}
