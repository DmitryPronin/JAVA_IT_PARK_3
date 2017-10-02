package com.company;

public class Main {

    public static void main(String[] args) {
        char digits[] = {'1', '2', '3'};
        int koef = 1;
        int result = 0;
        for (int i = digits.length - 1; i >=0; i--){
            int xCode = digits[i];
            result = result + (xCode - 48) * koef;
            koef = koef * 10 ;
        }






            // write your code here

        System.out.println(result);
    }
}