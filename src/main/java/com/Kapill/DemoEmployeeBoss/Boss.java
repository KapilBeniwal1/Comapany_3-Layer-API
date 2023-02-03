package com.Kapill.DemoEmployeeBoss;

public class Boss {
    private int id;
    private String name;
    private int salary;
    private int rating;

    public Boss(int id, String name, int salary, int rating) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
