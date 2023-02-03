package com.Kapill.DemoEmployeeBoss;

public class Employee {
    private int id;
    private String name;
    private int age;
    private int rating;
    private Boss boss;

    public Employee(int id, String name, int age, int rating, Boss boss) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.rating = rating;
        this.boss = boss;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Boss getBoss() {
        return boss;
    }

    public void setBoss(Boss boss) {
        this.boss = boss;
    }
}
