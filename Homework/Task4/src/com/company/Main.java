package com.company;

import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        char array[] = {'1','2', '4', '9'};
        int koef = 1;
        int cifra;
        int itog = 0;
        for (int i= array.length-1 ; i >= 0; i--){
            itog = itog + Character.digit(array[i], 10) * koef;
            koef = koef * 10;
            }

        System.out.println( itog );




    }
}
