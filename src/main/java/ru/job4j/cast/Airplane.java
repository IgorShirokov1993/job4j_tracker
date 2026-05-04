package ru.job4j.cast;

public class Airplane implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " flying in the sky");
    }

    @Override
    public void passenger(int quantity) {
        System.out.println(getClass().getSimpleName() + " Количество пассажиров внутри: " + quantity);
    }
}