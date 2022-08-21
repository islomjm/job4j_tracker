package ru.job4j.pojo;

import java.time.LocalDate;

public class Student {
    private String name;
    private String group;
    private LocalDate receipt;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public LocalDate getReceipt() {
        return receipt;
    }

    public void setReceipt(LocalDate receipt) {
        this.receipt = receipt;
    }
}
