package org.maktab.triangle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Triangle {
    private int n;
   private int[][] triangle=new int[n][n];
    public Triangle(int n) {
        this.n = n;
    }
    public int getN() {
        return n;
    }
    public void setN(int n) {
        this.n = n;
    }
    public int[][] getTriangle() {
        return triangle;
    }
    public void setTriangle(int[][] triangle) {
        this.triangle = triangle;
    }
    public int sumOfpath(){
        int sum=triangle[0][0];
        int max=0;
        for (int i = 1; i <n ; i++) {
            ArrayList<Integer> raw=new ArrayList<Integer>();
            for (int j = 0; j <=i ; j++) {
               raw.add(triangle[i][j]);
            }
            max=Math.max(triangle[i][max],triangle[i][max+1]);
            sum+=max;
            max=raw.indexOf(max);
        }
        return sum;
    }
}
