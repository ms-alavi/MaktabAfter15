package org.maktab.word;
import java.util.HashMap;
import java.util.HashSet;
//قسمت دوم سوال رو متوجه نشدم
public class Permutation {
  
    private static HashMap<Integer,String> permutationsIterative(String string){
        int [] factorials = new int[string.length()+1];
        factorials[0] = 1;
        for (int i = 1; i<=string.length();i++) {
            factorials[i] = factorials[i-1] * i;
        }
        HashMap<Integer,String> hashMapPermut=new HashMap<>();
        HashSet<String> hashSet=new HashSet<>();

        for (int i = 0; i < factorials[string.length()]; i++) {
            String onePermutation="";
            String temp = string;
            int positionCode = i;
            for (int position = string.length(); position > 0 ;position--){
                int selected = positionCode / factorials[position-1];
                onePermutation += temp.charAt(selected);
                positionCode = positionCode % factorials[position-1];
                temp = temp.substring(0,selected) + temp.substring(selected+1);
            }
           if ( hashSet.add(onePermutation))hashMapPermut.put(i,onePermutation);
        }
        return hashMapPermut;
    }

    public static void main(String[] args) {

        for (String value:permutationsIterative("cata"
                ).values()
             ) {
            System.out.println(value);
        }
    }
}


