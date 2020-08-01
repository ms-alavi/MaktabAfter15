package org.maktab.triangle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import sun.security.util.ArrayUtil;

public class triangleTest {
    public static void main(String[] args) {



        Scanner scanner=new Scanner(System.in);
        System.out.println("Plz enter n:");
        Triangle triangle=new Triangle(scanner.nextInt());
        triangle.setTriangle(initialize(scanner,triangle.getN()));
        System.out.println(triangle.sumOfpath());

    }


    public static int[][] initialize(Scanner scanner,int n){
        int[][] triangle=new int[n][n];
        System.out.println("Plz enter "+(n+1)*n/2+" numbers");
        for (int i = 0; i < n; i++) {
            for (int j = 0;j <=i ; j++) {
                triangle[i][j]=scanner.nextInt();
                if (i==j)break;
            }
            System.out.println();
        }
        return triangle;
    }

}
