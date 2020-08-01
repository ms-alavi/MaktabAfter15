package org.maktab.sandyhour;

import java.util.Scanner;

public class SandyHour {
//private int n;
//private int[][] arr=new int[n][n];

//************************************************************
    /*public void inputs(Scanner scanner)throws Exception{

        System.out.println("plz enter a number between 3 & 100");
       int number=scanner.nextInt();
        if (number<3||number>100)throw new BadInputs("number is not valid");
        else this.n=number;
        System.out.println("Please enter "+ n*n+"numbers between 9 and -9 ");
        for (int  i = 0;  i <n;  i++) {
            for (int j = 0; j <n ; j++) {
                boolean flag=false;
                while (!flag){
                    try {
                        int number1=scanner.nextInt();
                        if (number1<-9||number1>9)throw new BadInputs("number is not valid");
                        arr[i][j]=number1;
                        flag=true;
                    }catch (Exception e){
                        e.printStackTrace();

                    }
                }
            }
            System.out.println();
        }

        }*/
        //***********************************************
        private int sumOfSnady(int x,int y,int[][] arr){
        int sum=0;
            for (int i = x; i <3+x ; i++) {
                for (int j = y; j <3+y ; j++) {
                    if((j==y||j==2+y)&&i==1+x)continue;
                    sum+=arr[i][j];
                }

            }
        return sum;
        }
        //************************************ max sandy hour
        public int maxSandyHour(int n,int[][] arr){
        int maxSum=0;
            for (int i = 0; i <n ; i++) {
                for (int j = 0; j <n ; j++) {
                    int a;
                    if (i==n-2||i==n-1||j==n-1||j==n-2)
                        continue;
                    else a=  sumOfSnady(i,j,arr);
                   maxSum= Math.max(a,maxSum);
                }
            }
            return maxSum;
        }
        //**************************************** Exception
       /* private class BadInputs extends Exception{
            public BadInputs(String message) {
                super(message);
            }

            public BadInputs() {
            }
        }*/
    }
