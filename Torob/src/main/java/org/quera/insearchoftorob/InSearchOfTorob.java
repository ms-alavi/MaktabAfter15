package org.quera.insearchoftorob;

import java.util.Scanner;

public class InSearchOfTorob {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int x1=scanner.nextInt();
        int v1=scanner.nextInt();
        int x2=scanner.nextInt();
        int v2=scanner.nextInt();
        achieve(v1,v2,x1,x2);

    }
    public static void achieve(int v1,int v2,int x1,int x2){
int t=x2-x1/v1-v2;
        System.out.println(t);
        if (t>0) System.out.println("SEE YOU");
        if (t<0) System.out.println("BORO BORO");
       else System.out.println("WAIT WAIT");
    }
}
