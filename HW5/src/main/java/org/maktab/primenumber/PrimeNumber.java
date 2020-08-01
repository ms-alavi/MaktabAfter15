package org.maktab.primenumber;

import java.util.Arrays;

public class PrimeNumber {
    public static void main(String[] args) {
        PrimeNumber primeNumber=new PrimeNumber(54);
        if (primeNumber.thereIsTwoPrimes()) System.out.println(Arrays.toString(primeNumber.getA()));
        else System.err.println("The number cannot be converted to sum of two prime numbers");
    }
    private int number;
    private int[] a;

    public PrimeNumber(int n) {
        this.number = n;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    private boolean isPrime(int n){
        if (n<0) {
            for (int i = -2; i > n; i--) {
                if (n % i == 0) return false;
            }
        }
        for (int i = 2; i <n ; i++) {
            if (n%i==0)return false;
        }
        return true;
    }

    public int[] getA() {
        return a;
    }

    public boolean thereIsTwoPrimes(){
         a=new int[2];
         if (number <0){
             for (int i = -2; i > number; i--) {
                 if (isPrime(i)){
                     a[0]=i;
                     if (isPrime(number -i)){
                         a[1]= number -i;break;}
                 }

             }
         }
        for (int i = 2; i < number; i++) {
            if (isPrime(i)){
                a[0]=i;
                if (isPrime(number -i)){
                    a[1]= number -i;break;}
            }

        }
        if (a[0]!=0&&a[1]!=0){
            return true;
        }
        return false;
    }



}
