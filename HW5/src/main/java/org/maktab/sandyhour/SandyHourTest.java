package org.maktab.sandyhour;

import java.util.Scanner;

public class SandyHourTest {
   public static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        int n = getN();
        int[][] arr = getInts(n);
        SandyHour sandyHour = new SandyHour();
        System.out.println(sandyHour.maxSandyHour(n, arr));

    }
    private static int[][] getInts(int n) {
        System.out.println("Please enter "+ n*n+" numbers between 9 and -9 ");
        int[][] arr=new int[n][n];
        for (int  i = 0;  i <n;  i++) {
            for (int j = 0; j <n ; j++) {
                boolean flag=false;
                while (!flag){
                    try {
                        int number1=scanner.nextInt();
                        if (number1<-9||number1>9)throw new Exception( "!!!");
                        arr[i][j]=number1;
                        flag=true;
                    }catch (Exception e){
                        e.printStackTrace();

                    }
                }

            }

        }
        return arr;
    }

    private static int getN() {
        System.out.println("plz enter a number between 3 & 100");
        boolean flagn=false;

        int n=0;
        while (flagn!=true){
            try {

                 n=scanner.nextInt();
                if (n<3||n>100)throw new Exception("number is not valid");
                 flagn=true;

            }catch (Exception e){
                e.printStackTrace();
            }

        }
        return n;
    }
}
