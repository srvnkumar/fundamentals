package org.example;

import java.util.Comparator;
import java.util.PriorityQueue;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue(Comparator.reverseOrder());
        pq.add(4);
        pq.add(5);
        pq.add(1);
        pq.add(2);
        pq.add(6);
        pq.add(3);
        System.out.println(pq.peek());
    }
}