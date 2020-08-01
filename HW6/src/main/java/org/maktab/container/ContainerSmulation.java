package org.maktab.container;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class ContainerSmulation {
    private int n;
    private int size;
    private int[] arr;

    public ContainerSmulation(int n) {
        this.n = n;
        arr = new int[n];

    }

    public void sortSmallToBig() {
        Arrays.sort(arr);

    }

    public void sortBigToSmall() {
        Arrays.sort(arr);

        int[] array = new int[n];
        for (int i = 0, j = arr.length - 1; i < n; j--, i++) {
            array[i] = arr[j];
        }
        for (int i = 0; i < n; i++) {
            arr[i] = array[i];
        }


    }

    public void removeWithValue(int element) {

        for (int i = 0; i < n; i++) {
            if (arr[i] == element) {
                arr[i] = 0;
                for (int j = i; j < n - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                --i;
            }
        }
    }

    public int getIndexOfValue(int value) {

        for (int i = 0; i < n; i++) {
            if (arr[i] == value) return i;

        }
        return -1;

    }

    public void removeWithIndex(int index) {

        for (int i = 0; i < n; i++) {
            if (i == index) {
                arr[i] = 0;
                for (int j = i; j < n - 1; j++) {
                    arr[j] = arr[j + 1];
                }
            }
        }
    }


    public void add(int element) throws Exception {
        if (size < n) arr[size++] = element;
      //  if (size >= n) throw new IndexOutOfBoundsException("Container is full");

       else {
           int[] arr1=new int[++n];
           for (int i = 0; i <n ; i++) {
               arr1[i]=arr[i];
           }
            arr1[n]=element;
         arr1=new int[n];
         arr=new int[n];
           for (int i = 0; i <n ; i++) {
               arr[i]=arr1[i];
           }
           size++;


       }
    }

    @Override
    public String toString() {
        return "ContainerSmulation{" +
                "n=" + n +
                ", arr=" + Arrays.toString(arr) +
                '}';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContainerSmulation containerSmulation = new ContainerSmulation(5);
        System.out.println(containerSmulation);
        try {
            containerSmulation.add(20);
            containerSmulation.add(20);
            containerSmulation.add(5);
            containerSmulation.add(6);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(containerSmulation);
        containerSmulation.removeWithIndex(1);
        System.out.println("remove with index " + containerSmulation);
        containerSmulation.removeWithValue(5);
        System.out.println("remove with value " + containerSmulation);
        containerSmulation.sortSmallToBig();
        System.out.println("sort small to big " + containerSmulation);
        containerSmulation.sortBigToSmall();
        System.out.println("sort big to small " + containerSmulation);

        System.out.println(containerSmulation.getIndexOfValue(6));
        System.out.println(containerSmulation.getIndexOfValue(66));


    }
}
