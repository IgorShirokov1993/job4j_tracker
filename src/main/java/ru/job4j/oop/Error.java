package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("В сети: " + active);
        System.out.println("Статус: " + status);
        System.out.println("Входящее сообщение: " + message);
    }

    public static void main(String[] args) {
        Error one = new Error(true, 1, "Hello, my dear.");
        Error two = new Error(false, 0, "No incoming messages.");
        Error error = new Error();
        one.printInfo();
        two.printInfo();
        error.printInfo();
    }
}