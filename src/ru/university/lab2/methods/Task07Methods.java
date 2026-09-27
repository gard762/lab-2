package ru.university.lab2.methods;

public class Task07Methods {
    public void run(){
        print(5);
        print(2.4);
        print("hello");
        print(new int[]{1, 2, 3});
        print();
        System.out.println("sum() = " + sum());
        System.out.println("sum(1, 2 ,3) = " + sum(1, 2, 3));
        powDemo();
    }

    private void print(int x) {
        System.out.println("int: " + x);
    }

    private void print(double x){
        System.out.println("double: " + x);
    }

    private void print(String x){
        System.out.println("String: " + x);
    }

    private void print(int[] x){
        System.out.println("int: " + x.length);
    }

    private void print(){
        System.out.println("no args");
    }

    private int sum(int... nums){
        int s = 0;
        for(int i : nums)
            s += i;
        return s;
    }

    private int powRecursive(int base, int exp){
        if(exp == 0) return 1;
        return base * powRecursive(base, exp - 1);
    }

    private int powIterative(int base, int exp){
        int result = 1;
        for(int i = 0; i < exp; i++){
            result *= base;
        }
        return result;
    }

    private void powDemo(){
        for(int base : new int[]{2, 3}){
            for(int exp = 0; exp <= 4; exp++){
                int rec = powRecursive(base, exp);
                int it = powIterative(base, exp);
                double ref = Math.pow(base, exp);
                System.out.printf("%d^%d: rec=%d, it=%d, Math.pow=%.0f%n", base, exp, rec, it, ref);
            }
        }
    }
}