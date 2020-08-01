package org.maktab.orderlypair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OrderlyPair {

     public static List<Integer> removeBadElements(List<Integer> list){
         if (list==null)return null;
         int size=list.size();
         if (size%2!=0)list.remove(size-1);
         size=list.size();
         for (int i = 0; i <size-1 ; i++) {
             if(i%2==0){
                 if (list.get(i + 1) <list.get(i)){
                     list.remove(i+1);
                     list.remove(i);
                     size=list.size();
                     i=i-2;
                 }
             }
         }
        return list;
    }

    public static void main(String[] args) {
         List<Integer> elements= Arrays.asList(3, 1,9);
      //   ArrayList<Integer> elementss= (ArrayList<Integer>) Arrays.asList(3, 7,9, 2, 5, 5, 8, 5, 6, 3, 4, 7,3,1,8);
        //why there is error when i passed elementss as parameter to method?
        List<Integer> list=new ArrayList<>();
        list.addAll(elements);
        System.out.println(removeBadElements(list));
    }
}
