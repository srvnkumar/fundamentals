package org.example;

import java.util.TreeMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(100, "A");
        treeMap.put(101, "B");
        treeMap.put(102, "C");
        treeMap.put(103, "D");
        treeMap.put(104, "E");
        treeMap.entrySet().forEach(System.out::println);
    }
}