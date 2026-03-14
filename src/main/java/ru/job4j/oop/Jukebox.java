package ru.job4j.oop;

public class Jukebox {
    public static String music(int position) {
        String song;
        if (position == 1) {
            song = "Пусть бегут неуклюже";
        } else if (position == 2) {
            song = "Спокойной ночи";
        } else {
            song = "Песня не найдена";
        }
        return song;
    }

    public static void main(String[] args) {
        System.out.println(music(0));
        System.out.println(music(1));
        System.out.println(music(2));
        System.out.println(music(3));
    }
}
