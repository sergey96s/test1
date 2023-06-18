package org.example;

public class Calc {

    public int summ(int a, int b) {
        int result;
        result = a + b;
        System.out.printf("Сумма %d и %d равна %d\n", a, b, result);
        return result;
    }

    public int difference(int c, int d) {
        int result1;
        result1 = c - d;
        System.out.printf("Разность %d и %d равна %d\n", c, d, result1);
        return result1;
    }
}