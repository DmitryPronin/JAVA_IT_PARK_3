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
    int max = array[0];

    for (int i = 1; i < array.length; i++){
        if (min>array[i]){
                min = array[i];
        }
        if (max<array[i]){
                max = array[i];
        }
    }
    int temp = min;
    min = max;
    max = temp;
    System.out.println("min =" + min);
    System.out.println("");
    }
}
