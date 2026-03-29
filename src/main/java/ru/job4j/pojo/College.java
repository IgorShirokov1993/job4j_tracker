package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setSurname("Shirokov Igor");
        student.setGroup(3211);
        student.setReceipt(2018, 5, 30);

        System.out.println(student.getSurname() + " joined the group - " + student.getGroup()
                + " : " + student.getReceipt());
    }
}
