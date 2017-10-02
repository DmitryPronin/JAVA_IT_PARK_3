package ru.itpark;

import java.util.Scanner;

public class MainReadArrayFromConsole {
    public static void main(String[] args){
   Scanner scanner = new Scanner(System.in);
   int arraySize = scanner.nextInt();
    int array[] = new int[arraySize];

   for (int i = 0; i<array.length; i++){
       array[i] = scanner.nextInt();
    }
    int min = array[0];
        int minI = 0;
    int max = array[0];
    int maxI = 0;

    for (int i = 1; i < array.length; i++){
        if (min>array[i]){
                min = array[i];
                minI = i;
        }
        if (max<array[i]){
                max = array[i];
                maxI = i;
        }
    }

    int temp = array[minI];
        array[maxI] = array[minI];
        array[minI] = temp;

        for (int i = 0; i < array.length ; i++) {
            System.out.print(array[i] + " ");
        }
}}
