package org.maktab.p1;

import java.util.ArrayList;
import java.util.List;

public class P1 {
    public static void main(String[] args) {
        String string="A big black bear sat on a big black rug";
        String[] s=string.split(" ");
        List<String> list=new ArrayList<>();
        for (int i = 0; i <s.length ; i++) {
            list.add(s[i]);
        }
        for (String elements:list
             ) {
            if(elements.length()==3) System.out.print("*** "+elements+" ");
            else System.out.print(elements+" ");
        }


    }

}
