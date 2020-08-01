package org.maktab.p2;

public class SumOfArray {
    public static void main(String[] args) {
        double sum=0;
        try {
          sum=  sumOfArray(1,2,3,4,5);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        System.out.println(sum);
    }

    public static double sumOfArray(int...a){
        int i=0;

        double sum=0;
      try {
          while (true){

              sum+=a[i];
              i++;
          }
      }catch (Exception ex){
          ex.printStackTrace();
      }
      return sum;


    }
}
