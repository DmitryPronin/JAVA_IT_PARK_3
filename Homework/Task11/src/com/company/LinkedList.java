package com.company;

public class LinkedList implements List {

    private Node head;
    private int count;

    public LinkedList() {
        this.head = null;
        this.count = 0;
    }

    @Override
    public void addToEnd(String element) {
        Node newNode = new Node(element);
        if (head != null) {
            Node currentNode = new Node("0");
            currentNode = head;
            for (int i = 0; i < count; i++) {
                if (currentNode.next == null) {
                    currentNode.next = newNode;
                    count++;
                } else {
                    currentNode = currentNode.next;
                }


            }
        }else {
            head = newNode;
            count++;

        }


    }

    public void addToBegin(String element) {
        // создали узел для элемента
        Node newNode = new Node(element);

        if (head != null) {
            newNode.next = head;
        }

        head = newNode;
        count++;
    }

    public void showLinkedList(){
        Node currentNode = new Node("0");
        currentNode = head;

        if (head == null){
            System.out.println("NO DATA");
        } else {
            for (int i=0; i<count; i++){

                System.out.println(i+1 + " element = " + currentNode.value);
                currentNode = currentNode.next;



            }
        }

    }

    public void deleteCurrent(int positionElement){
        Node currentNode = new Node("0");
        currentNode = head;

        if (positionElement>count || positionElement <= 0){
            System.out.println("NO data on this position");
        }else if (positionElement == 1){
            count--;
            head = head.next;
        }else if (positionElement == 2){
            count--;
            head.next = head.next.next;
        }else {
            for (int i=0 ; i < positionElement-2; i++){
                currentNode = currentNode.next;
            }
            currentNode.next = currentNode.next.next;
            count--;
        }
    }

    public void addToPosition(int position, String element){
        Node newNode = new Node(element);
        Node tempNode = new Node("0");
        tempNode = head;

        if (position > count || position< 0){
            System.out.println("Invalid value");
        }else if (position == 1){
            newNode.next = head;
            head = newNode;
            count++;

        }else {
            for (int i=0 ; i < position-2; i++){
                tempNode = tempNode.next;

            }
            newNode.next = tempNode.next;
            tempNode.next = newNode;
            count++;
        }
    }

    @Override
    public Iterator iterator() {
        return new LinkedListIterator();
    }

    private class LinkedListIterator implements Iterator {

        private Node currentNode;

        LinkedListIterator() {
            currentNode = head;
        }

        @Override
        public String next() {
            String element =  currentNode.value;
            currentNode = currentNode.next;
            return element;
        }

        @Override
        public boolean hasNext() {
            return currentNode != null;
        }
    }

    private static class Node {
        private String value;
        private Node next;

        Node(String value) {
            this.value = value;
            this.next = null;
        }
    }
}
