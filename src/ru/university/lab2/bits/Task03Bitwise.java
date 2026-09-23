package ru.university.lab2.bits;

public class Task03Bitwise {
    public void run(){
        showOperators();
        signedVsUnsignedShift();
        parityCheckDemo();
        powerOfTwoDemo();
        bitCountDemo();
        swapDemo();
    }

    private void showOperators(){
        int a = 0b1100;
        int b = 0b1010;
        System.out.println("a & b = " + (a & b));
        System.out.println("a | b = " + (a | b));
        System.out.println("a ^ b = " + (a ^ b));
        System.out.println("~a = " + (~a));
        System.out.println("a << 1 = " + (a << 1));
        System.out.println("a >> 1 = " + (a >> 1));
        System.out.println("a >>> 1 = " + (a >>> 1));
    }

    private void signedVsUnsignedShift(){
        int neg = -8;
        // >> сохраняет знак, >>> заполняет нулями
        System.out.println("-8 >> 1 = " + (neg >> 1));
        System.out.println("-8 >>> 1 = " + (neg >>> 1));
    }

    private void parityCheckDemo() {
        System.out.println("10 чётное? " + isEven(10));
        System.out.println("7  чётное? " + isEven(7));
    }

    private boolean isEven(int x) {
        return (x & 1) == 0;
    }

    private void powerOfTwoDemo() {
        System.out.println("16 степень 2? " + isPowerOfTwo(16));
        System.out.println("18 степень 2? " + isPowerOfTwo(18));
    }

    private boolean isPowerOfTwo(int x) {
        return x > 0 && (x & (x - 1)) == 0;
    }

    private void bitCountDemo() {
        System.out.println("Битов в 13: " + countBits(13));
    }

    private int countBits(int x) {
        int count = 0;
        while (x != 0) {
            count += (x & 1);
            x >>>= 1;
        }
        return count;
    }

    private void swapDemo() {
        int x = 5, y = 9;
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println("После swap: x=" + x + ", y=" + y);
    }
}