package com.company;

public class Main {

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < arrayList.getMaxCount(); i++) {
            arrayList.getLinkedList()[i] = new LinkedList();
        }

        DataReader reader = new DataReader("C:\\java\\JAVA_IT_PARK_3\\Homework\\Task11\\src\\com\\company\\words.txt");
        String word = reader.readString();
        DataReader numbersReader = new DataReader("C:\\java\\JAVA_IT_PARK_3\\Homework\\Task11\\src\\com\\company\\words.txt");
        int number = numbersReader.readInteger();
        while (word.length() > 0 || number != 0) {
            arrayList.getLinkedList()[number].addToBegin(word);
            word = reader.readString();
            number = numbersReader.readInteger();
        }
    }
}










