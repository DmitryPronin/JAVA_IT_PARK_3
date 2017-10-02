package com.company;
import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int array[] = new int[size];

        for (int i=0; i<array.length; i++){
            array[i] = scanner.nextInt();
        }
        int sumNech = 0;
        int sumChet = 0;
        int pozNech = 0;
        int pozChet = 0;
        int kolMax = 0;
        for (int i=0; i<array.length; i++){
            if (i%2 == 0){
                pozChet = pozChet + array[i];
            }
            else {
                pozNech = pozNech + array[i];
            }
            if (array[i]%2 == 0){
                sumChet = sumChet + array[i];
            }
            else {
                sumNech = sumNech + array[i];
            }
        }
        System.out.println("Summa nechet = " + sumNech);
        System.out.println("Summa chet = " + sumChet);
        System.out.println("Summa chet. poziciy = " + pozChet);
        System.out.println("Summa nechet poziciy = " + pozNech);
        for (int i = 1; i<array.length-1; i++){
            if ((array[i-1] < array[i]) && (array[i] < array[i+1])) {
                kolMax = kolMax + 1;
            }
        }
        System.out.println("Kolichestvo maximumov = " + kolMax);
        int dlinaPosl = 1;
        int dlinaMaxposl = 1;
        for (int i=0 ; i < array.length-1; i++){
            if (array[i] < array[i+1]) {
                dlinaPosl = dlinaPosl + 1;
                dlinaMaxposl = dlinaPosl;
            }
            else if (array [i] > array[i+1]){
                if (dlinaMaxposl < dlinaPosl){
                    dlinaMaxposl = dlinaPosl;
                    dlinaPosl = 1;
                }else {
                    dlinaPosl = 1;
                    dlinaMaxposl = dlinaPosl;
                }

            }
        }
        System.out.println("Dlina maximal'noy posledovatel'nosti  = " + dlinaMaxposl);
        int temp = 0;
        for (int i=0 ; i < array.length; i++){
            if (array[i] == 0) {
                array[i] = array[i+1]*(-1);
            }
        }
        System.out.println(Arrays.toString(array));


        // write your code here
    }
}
