package org.example;

import java.util.HashSet;
import java.util.Set;

public class Vovanidze {

    public static void main(String[] args) {
        System.out.println(hasRepeats("119qwertyuioasdfghjkzxcvbnm"));
    }

    public static boolean hasRepeats(String str) {
        Set<Character> s = new HashSet<>();
        char[] array = str.toCharArray();
        for (char c : array) {
            System.out.println(c);
            if (!s.add(c)) {
                return true;
            }
        }
        return false;
    }
}
