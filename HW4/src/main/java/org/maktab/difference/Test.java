package org.maktab.difference;

import java.util.Scanner;

public class Test {
    private static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {

        double[] n1 = getInputs();

        System.out.println("Max difference is : "+Difference .getMaxDifference(n1));
        System.out.println("Min difference is : "+Difference .getMinDifference(n1));

    }

    private static double[] getInputs() {
        String numbers=scanner.nextLine();
        String[] parts = numbers.split(" ");
        double[] n1 = new double[parts.length];
        for(int n = 0; n < parts.length; n++) {
            n1[n] = Double.parseDouble(parts[n]);
        }
        return n1;
    }
}
