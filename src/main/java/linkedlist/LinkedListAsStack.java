package src.main.java.linkedlist;

import java.util.LinkedList;

public class LinkedListAsStack {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);


        list.add(1);
        list.add("Aman");
        list.add("Sagar");
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
        list.removeFirst();
        System.out.println(list);
    }
}
