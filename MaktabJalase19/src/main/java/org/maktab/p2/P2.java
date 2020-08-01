package org.maktab.p2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class P2 {
    public static void main(String[] args) {
        List<Integer> numbers=new ArrayList<>();
        List<Integer> repetetiveNumbers=new ArrayList<>();
        HashSet<Integer> hashSet=new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(4);
        numbers.add(45);
        numbers.add(55);
        numbers.add(3);
        numbers.add(32);
        numbers.add(22);
        numbers.add(22);
        numbers.add(55);
        numbers.add(1);
        for (int a:numbers
             ) {
            if (hashSet.add(a)) {
                            continue;
            } else repetetiveNumbers.add(a);

        }
        for (int a:repetetiveNumbers
             ) {
            System.out.println(a+" ");
        }
    }
}
