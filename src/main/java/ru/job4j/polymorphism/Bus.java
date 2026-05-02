package ru.job4j.polymorphism;

public class Bus implements Transport {
    @Override
    public void move() {
        System.out.println("Автобус должен двигаться со скоростью не более 60 км/ч.");
    }

    @Override
    public void passengers(int count) {
        if (count <= 100) {
            System.out.println("Автобус может трогаться.");
        } else {
            System.out.println("Автобус переполнен!");
        }
    }

    @Override
    public int refuel(int fuel) {
        int cost = fuel * 69;
        System.out.println("Бак заправлен на " + fuel + " литров, заплатили " + cost + " рублей");
        return cost;
    }

    public static void main(String[] args) {
        Transport bus = new Bus();
        bus.move();
        bus.passengers(100);
        bus.passengers(101);
        bus.refuel(5);
    }
}