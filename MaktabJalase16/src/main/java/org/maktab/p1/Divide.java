package org.maktab.p1;

import java.util.Scanner;

public class Divide {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        double a=scanner.nextDouble();
        double b=scanner.nextDouble();
        try {
            divide(a,b);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static double divide(double a, double b)throws Exception{
        if (b==0){
            throw new Exception("Divide By Zero");

        }
        return a/b;
    }
}
