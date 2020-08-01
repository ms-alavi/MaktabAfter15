package org.maktab.binary;

public class Binary {
    public static void main(String[] args) {
        System.out.println(decimalToBinary(294));
        System.out.println(binaryToDecimal("101100101"));


    }
    public static String decimalToBinary(int number){
           String binary=Integer.toBinaryString(number);
        return binary;
        }

        public static int binaryToDecimal(String binary){
        int size=binary.length();
        int decimal=0;

            for (int i = size-1,j=0; i >=0 && j<size; i--,j++) {
                if (binary.charAt(j)!='0') {
                    decimal += Math.pow(2,i);
                }
            }
        return decimal;
        }
    }

