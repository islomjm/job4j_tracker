package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int b) {
        return x - b;
    }

    public int divide(int c) {
        return x / c;
    }

    public int sumAllOperation(int d) {
        return sum(d) + multiply(d) + minus(d) + divide(d);
    }

    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);
        Calculator calculator = new Calculator();
        int rsl = calculator.multiply(5);
        System.out.println(rsl);
        int rsl2 = minus(2);
        System.out.println(rsl2);
        Calculator calculator1 = new  Calculator();
        int rsl3 = calculator1.divide(5);
        System.out.println(rsl3);
        Calculator calculator2 = new Calculator();
        int rsl4 = calculator2.sumAllOperation(5);
        System.out.println(rsl4);
    }
}
