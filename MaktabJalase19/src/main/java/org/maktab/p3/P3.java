package org.maktab.p3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;


public class P3 {

    public static void main(String[] args) {
        String str = "Ajjjjjit";
        characterCount(str);
    }

    static void characterCount(String inputString) {


        HashMap<Character, Integer> charCount = new HashMap<Character, Integer>();



        char[] strArray =new char[inputString.length()];
        for (int i = 0; i <inputString.length() ; i++) {
            strArray[i]=inputString.charAt(i);
        }

        for (char c : strArray) {
            if (charCount.containsKey(c)) {
                charCount.put(c, charCount.get(c) + 1);
            } else {

                charCount.put(c, 1);
            }
        }

        for (Map.Entry entry : charCount.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }


}
