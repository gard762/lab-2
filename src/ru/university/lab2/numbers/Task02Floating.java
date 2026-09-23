package ru.university.lab2.numbers;

public class Task02Floating {
    public void run(){
        sumDemo();
        loopSumDemo();
        epsilonCompareDemo();
        specialValuesDemo();
        roundingDemo();
        floatVsDoubleDemo();
    }

    private void sumDemo(){
        double s = 0.1 + 0.2;
        // 0.1 и 0.2 не представимы точно в двоичной системе, поэтому получаем 0.30000000000000004
        System.out.println("0.1 + 0.2 = " + s);
    }

    private void loopSumDemo(){
        double sum = 0.0;
        for(int i = 0; i < 10; i++)
            sum += 0.1;
        System.out.println("Сумма 10 * 0.1 == 1.0? " + (sum == 1.0));
        System.out.println("Фактическое значение: " + sum);
    }

    private void epsilonCompareDemo(){
        System.out.println("equals(0.1 + 0.2, 0.3, 1e-9: " + nearlyEqual(0.1 + 0.2, 0.3, 1e-9));
    }

    private boolean nearlyEqual(double a, double b, double eps){
        return Math.abs(a - b) < eps;
    }

    private void specialValuesDemo(){
        double inf = 1.0 / 0.0;
        double ninf = -1.0 / 0.0;
        double nan = 0.0 / 0.0;
        System.out.println("Infinity: " + inf);
        System.out.println("-Infinity: " + ninf);
        System.out.println("NaN: " + nan);
        System.out.println("NaN == NaN? " + (nan == nan));
    }

    private void roundingDemo(){
        double v = 2.7;
        System.out.println("int 2.7: " + (int)v);
        System.out.println("Math.round: " + Math.round(v));
        System.out.println("Math floor: " + Math.floor(v));
        System.out.println("Math ceil: " + Math.ceil(v));
        System.out.println("int -2.7: " + (int)(-2.7));
    }

    private void floatVsDoubleDemo(){
        float f = 0.1f + 0.2f;
        double d = 0.1 + 0.2;
        System.out.println("float 0.1 + 0.2 = " + f);
        System.out.println("double 0.1 + 0.2 = " + d);
        System.out.println("double точнее, так как больше бит под мантиссу");
    }
}