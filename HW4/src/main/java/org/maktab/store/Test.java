package org.maktab.store;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Jacket lionCoat=new Jacket("Lion coat",Seasons.Fall,100000);
        System.out.println("Lion Coat : " + lionCoat.getPrice());
        lionCoat.setDiscountStrategy(new YaldaDiscountStrategy());
        System.out.println("Lion Coat with Yalda discount: "+lionCoat.getPrice());
        lionCoat.setDiscountStrategy(new WinterDiscountStrategy());
        System.out.println("Lion Coat with Winter discount: "+lionCoat.getPrice());
        Clothing woolenSocks=new Pants("Woolen Sockes",Seasons.Winter,10000);
        System.out.println("Woolen Socks: "+woolenSocks.getPrice());
        woolenSocks.setDiscountStrategy(new SummerDiscountStrategy());
        System.out.println("Woolen Socks with Summer discount : "+woolenSocks.getPrice());
        woolenSocks.setDiscountStrategy(new WinterDiscountStrategy());
        System.out.println("Woolen Socks with winter discount : "+woolenSocks.getPrice());

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int cnt=0;
        if (in.hasNextLine()) {
            in.nextLine();
        }
        for (int i = 0; i < N; i++) {
            String row = in.nextLine();
            for(int j=0;j<row.length();j++){
                if(String.valueOf(row.charAt(i)).equals(Integer.toString(i)))cnt++;
            }
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(cnt);

    }
}
