package ru.university.lab2.numbers;

public class Task01Integers {
    public void run(){
        printRanges();
        overflowMaxInt();
        multiplyMaxInt();
        integerDivision();
        longToIntNarrowing();
        charArithmetic();
        overflowCheckDemo();
    }

    private void printRanges(){
        System.out.println("byte: " + Byte.MIN_VALUE + " .. " + Byte.MAX_VALUE);
        System.out.println("short: " + Short.MIN_VALUE + " .. " + Short.MAX_VALUE);
        System.out.println("int: " + Integer.MIN_VALUE + " .. " + Integer.MAX_VALUE);
        System.out.println("long: " + Long.MIN_VALUE + " .. " + Long.MAX_VALUE);
    }

    private void overflowMaxInt(){
        System.out.println("Integer.MAX_VALUE + 1 = " + (Integer.MAX_VALUE + 1));
    }

    private void multiplyMaxInt(){
        System.out.println("Integer.MAX_VALUE * 2 (int) = " + Integer.MAX_VALUE * 2);
        System.out.println("Integer.MAX_VALUE * 2 (long) = " + (long)Integer.MAX_VALUE * 2);
        System.out.println("Разница: int переполняется, long вмещает результат.");
    }

    private void integerDivision(){
        System.out.println("5 / 2 = " + (5 / 2));
        System.out.println("-5 / 2 = " + (-5 / 2));
        System.out.println("5 % 2 = " + (5 % 2));
        System.out.println("-5 % 2 = " + (-5 % 2));
        System.out.println("Знак остатка совпдает со знаком делимого");
    }

    private void longToIntNarrowing(){
        long big = (long) Integer.MAX_VALUE + 1;
        int narrowed = (int) big;
        System.out.println("long > MAX_VALUE приведен к int: " + narrowed);
    }

    private void charArithmetic(){
        char c = 'A';
        char next = (char)(c + 1);
        char sum = (char)('A' + 'B');
        System.out.println("Следующая буква после А: " + next);
        System.out.println("'A' + 'B' как число: " + (int)sum);
        System.out.println("'A' + 'B' как символ: " + sum);
    }

    private void overflowCheckDemo(){
        System.out.println("10 + 20 переполняется? " + hasOverFlow(10, 20));
        System.out.println("MAX + 1 переполянется? " + hasOverFlow(Integer.MAX_VALUE, 1));
    }

    private boolean hasOverFlow(long a, long b){
        long sum = a + b;
        return sum > Integer.MAX_VALUE || sum < Integer.MIN_VALUE;
    }
}