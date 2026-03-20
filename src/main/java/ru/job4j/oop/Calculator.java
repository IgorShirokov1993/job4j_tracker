package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int o) {
        return o - x;
    }

    public int multiply(int a) {
        return x * a;
    }

    public int divide(int d) {
        return d / x;
    }

    public int sumAllOperation(int value) {
        return sum(value) + minus(value) + multiply(value) + divide(value);
    }

    public static void main(String[] args) {
        int result = sum(10);
        int difference = minus(25);
        System.out.println(result);
        System.out.println(difference);
        Calculator calculator = new Calculator();
        int multiplication = calculator.multiply(5);
        System.out.println(multiplication);
        int division = calculator.divide(150);
        System.out.println(division);
        int total = calculator.sumAllOperation(10);
        System.out.println("Сумма всех операций: " + total); // 15 + 5 + 50 + 2 = 72
    }
}
