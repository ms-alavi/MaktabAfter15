package org.maktab.difference;

import java.util.Arrays;
import java.util.Scanner;

public class Difference {
    public static double getMaxDifference(double... a){
        Arrays.sort(a);
        return a[a.length-1]-a[0];
    }
    public static double getMinDifference(double...a){
        double minDifference=getMaxDifference(a);
        for (int i = 0; i <a.length-1 ; i++) {
            double diff=a[i+1]-a[i];
            if (minDifference>diff)minDifference=diff;

        }
        return minDifference;
    }
}
