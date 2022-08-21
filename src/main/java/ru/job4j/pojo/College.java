package ru.job4j.pojo;

import java.time.LocalDate;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Jambaev Islomjon");
        student.setGroup("Intern");
        student.setReceipt(LocalDate.of(2022, 6, 1));
        System.out.println(student.getName() + " was entered the " + student.getGroup() + " at " + student.getReceipt());
    }
}
