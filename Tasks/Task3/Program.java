import java.util.Scanner;
class Program{
    public static void main(String[] args) {
        System.out.print("Vvedite summu dlya snyatiya sredst:");
        Scanner scanner = new Scanner(System.in);
        int summa;
        summa = scanner.nextInt();
        int x5000 = summa / 5000;
        summa = summa % 5000;
        int x1000 = summa / 1000;
        summa = summa % 1000;
        int x500 = summa / 500;
        summa = summa % 500;
        int x100 = summa / 100;
        summa = summa% 100;
        int x50 = summa / 50;
        summa = summa % 50;
        int x10 = summa / 10;
        summa = summa % 10;
        int x5 = summa / 5;
        summa = summa % 5;
        int x2 = summa / 2;
        summa = summa % 2;
        int x1 = summa;

        System.out.println("5000 rubles kupur = " + x5000);
        System.out.println("1000 rubles kupur = " + x1000);
        System.out.println("500 rubles kupur = " + x500);
        System.out.println("100 rubles kupur = " + x100);
        System.out.println("50 rubles kupur = " + x50);
        System.out.println("10 rubles kupur = " + x10);
        System.out.println("5 rubles monet = " + x5);
        System.out.println("2 rubles monet = " + x2);
        System.out.println("1 rubles monet = " + x1);


    }
}