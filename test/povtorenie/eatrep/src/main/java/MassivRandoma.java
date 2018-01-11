import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

public class MassivRandoma {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>(1000);
        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            int newDiggit = random.nextInt(1000) + 1;
            if (!arrayList.contains(newDiggit)) {
                arrayList.add(newDiggit);
            } else i--;
        }
        int del = random.nextInt(1000) + 1;
        arrayList.set(del, 0);
        int array[];
        array = new int[1000];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
            if (!arrayList.contains(array[i])) {
                System.out.println("Массив не содержит " + array[i]);
            }
        }
    }
}







//        Random random = new Random();
//        int f = random.nextInt(1000)+1;
//
//        for (int i = 0 ; i < array.length; i++ ){
//            int temp;
//            boolean status = false;
//            do {
//                temp = random.nextInt(1000)+1;
//                for (int j = 0 ; j<i ; j++){
//                    if (temp == array[j]) status = true;
//                    }
//            } while (status == true);
//            array[i] = temp;
//        }
//






