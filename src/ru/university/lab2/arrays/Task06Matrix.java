package ru.university.lab2.arrays;

import java.util.Random;

public class Task06Matrix {
    public void run(){
        int[][] m = createMatrix(3, 3);
        printMatrix(m);
        printMatrix(transpose(m));
        multiplyDemo();
    }

    private int[][] createMatrix(int rows, int cols){
        int[][] m = new int[rows][cols];
        Random r = new Random();
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++)
                m[i][j] = r.nextInt(10);
        }
        return m;
    }

    private void printMatrix(int[][] m){
        for(int[] row : m){
            StringBuilder sb = new StringBuilder();
            for(int r : row)
                sb.append(String.format("%4d", r));
            System.out.println(sb);
        }
        System.out.println();
    }

    private int[][] transpose(int[][] m){
        int[][] t = new int[m[0].length][m.length];
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[0].length; j++){
                t[j][i] = m[i][j];
            }
        }
        return t;
    }

    private void multiplyDemo(){
        int[][] a = {{1, 2, 3}, {4, 5, 6}};
        int[][] b = {{7, 8}, {9, 10}, {11, 12}};
        int[][] c = multiply(a, b);
        if (c != null) printMatrix(c);
        int[][] bad = multiply(a, a);
        if (bad == null) System.out.println("Умножение невозможно: размеры не согласованы.");
    }

    private int[][] multiply(int[][] a, int[][] b) {
        if (a[0].length != b.length)
            return null;
        int[][] r = new int[a.length][b[0].length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < b[0].length; j++) {
                int sum = 0;
                for (int k = 0; k < b.length; k++) sum += a[i][k] * b[k][j];
                r[i][j] = sum;
            }
        return r;
    }
}