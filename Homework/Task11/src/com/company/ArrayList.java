package com.company;

public class ArrayList {
    private static final int MAX_COUNT = 100;
    private LinkedList linkedList[];

    public ArrayList() {
        this.linkedList = new LinkedList[MAX_COUNT];
    }

    public int getMaxCount() {
        return MAX_COUNT;
    }

    public LinkedList[] getLinkedList() {
        return linkedList;
    }
}
