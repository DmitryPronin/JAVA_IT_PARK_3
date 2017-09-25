package ru.itpark;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        System.out.print("Введите целое число :");
	    Scanner scan = new Scanner(System.in);
        int aCode = scan.nextInt();
        char a = (char)aCode;
        System.out.println("Значение вашего кода = " + a);

    }
}
