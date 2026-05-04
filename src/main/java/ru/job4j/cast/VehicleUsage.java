package ru.job4j.cast;

public class VehicleUsage {
    public static void main(String[] args) {
        Vehicle superjet = new Airplane();
        Vehicle boeing = new Airplane();
        Vehicle swallow = new Train();
        Vehicle peregrine = new Train();
        Vehicle scania = new Bus();
        Vehicle paz = new Bus();
        Vehicle[] vehicles = new Vehicle[]{superjet, boeing, swallow, peregrine, scania, paz};
        for (Vehicle vehicle : vehicles) {
            vehicle.move();
            vehicle.passenger(21);
        }
    }
}
