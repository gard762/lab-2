package ru.university.lab2.arrays;

import java.util.Arrays;
import java.util.Random;

public class Task05Arrays {
    public void run(){
        int[] arr = createRandomArray(10);
        printArray(arr);
        System.out.println("min=" + min(arr) + ", max=" + max(arr) + ", avg=" + average(arr));
        int[] sorted = bubbleSort(arr.clone());
        printArray(sorted);
        compareArrDemo();
    }

    private int[] createRandomArray(int size){
        int[] a = new int[size];
        Random r = new Random();
        for(int i = 0; i < size; i++)
            a[i] = r.nextInt(100);
        return a;
    }

    private void printArray(int[] a){
        StringBuilder sb = new StringBuilder("[");
        for(int i = 0; i < a.length; i++){
            sb.append(a[i]);
            if(i < a.length - 1) sb.append(", ");
        }
        sb.append("]");
        System.out.println(sb);
    }

    private int max(int[] a){
        int m = a[0];
        for(int i = 0; i < a.length; i++){
            if(a[i] > m) m = a[i];
        }
        return m;
    }

    private int min(int[] a){
        int m = a[0];
        for(int i = 0; i < a.length; i++){
            if(a[i] < m) m = a[i];
        }
        return m;
    }

    private double average(int[] a){
        int sum = 0;
        for(int i = 0; i < a.length; i++)
            sum += a[i];
        return (double) sum / a.length;
    }

    private int[] bubbleSort(int[] a){
        for(int i = 0; i < a.length - 1; i++){
            for(int j = 0; j < a.length - 1 - i; j++){
                if(a[j + 1] < a[j]){
                    int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }
        }
        return a;
    }

    private void compareArrDemo(){
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        System.out.println("a == b                   : " + (a == b));
        System.out.println("arr1.equals(arr2)        : " + a.equals(b));
        System.out.println("Arrays.equals(arr1, arr2): " + Arrays.equals(a, b));
    }
}