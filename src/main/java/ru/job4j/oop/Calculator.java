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
        return d;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = sum(10);
        System.out.println(result);
        int rsl = calculator.multiply(5);
        System.out.println(rsl);
        int rsl2 = Calculator.minus(2);
        System.out.println(rsl2);
        int rsl3 = calculator.divide(5);
        System.out.println(rsl3);
        int rsl4 = calculator.sumAllOperation(result + rsl + rsl2 + rsl3);
        System.out.println(rsl4);
    }
}
