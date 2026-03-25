package ru.job4j.inheritance;

public class HideExampleMain {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal cat = new Cat();
        animal.instanceInvoke();
        cat.instanceInvoke();
        Animal.staticInvoke();
        Cat.staticInvoke();
        cat.staticInvoke(); // Объект cat имеет тип переменной Animal (при этом сам объект cat - это объект класса Cat), поэтому вызывается статический метод из класса Animal.
        Animal other = null;
        other.staticInvoke(); // Объект other тоже имеет тип переменной Animal, и несмотря на то, что объект равен null, метод вызывается из класса Animal.
        Cat kitty = new Cat();
        kitty.staticInvoke(); // Объект kitty имеет тип переменной Cat, поэтому статический метод вызывается из Cat.
    }
}
