package ru.job4j.pojo;

import java.time.LocalDate;

public class Student {
    private String surname;
    private int group;
    private LocalDate receipt;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public LocalDate getReceipt() {
        return receipt;
    }

    public void setReceipt(int year, int month, int dayOfMonth) {
        this.receipt = LocalDate.of(year, month, dayOfMonth);
    }
}
