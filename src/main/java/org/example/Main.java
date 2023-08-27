package org.example;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> hm = new HashMap<>();
        hm.put("B", "1");
        hm.put("C", "2");
        hm.put("A", "3");

        Map<String, String> lhm = new LinkedHashMap<>();
        lhm.put("B", "1");
        lhm.put("C", "2");
        lhm.put("A", "3");

        for (Map.Entry<String, String> entry : hm.entrySet()) {
            System.out.print(entry.toString() + " | ");
        }

        System.out.println();

        for (Map.Entry<String, String> entry : lhm.entrySet()) {
            System.out.print(entry.toString() + " | ");
        }
    }
}
