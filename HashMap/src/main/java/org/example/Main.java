package org.example;

import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("a", "b");
        map.put("c", "d");
        map.put("e", "f");
        map.forEach((k, v) -> System.out.println(k + "=" + v));
        map.remove("a");
        map.forEach((k, v) -> System.out.println(k + "=" + v));
      //  map.put("null","null");
        map.put(null,null);
        System.out.println(map.get(null));
        if(map.containsKey("e")){
            System.out.println(map.get("e"));
        }
        if(map.containsValue("d")){
            System.out.println("value d available");
        }
        map.keySet().forEach(key -> System.out.println(key + "=" + map.get(key)));
        map.values().forEach(System.out::println);
        System.out.println("Siz eof map:"+map.size());
//        System.out.println(map.get("null")); //prints null
//        System.out.println(map.get("c"));
    }
}