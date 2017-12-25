package com.epam.javalabtwentythree.task.first;

//*
/* Первое задание: создать иерархию классов.
 */

public abstract class Employee {

    private String name;
    private String surname;
    private int yearOfBorn;
    private int ratePerHour; // RatePerHour

    Employee(String name, String surname, int yearOfBorn, int ratePerHour) {
        this.name = name;
        this.surname = surname;
        this.yearOfBorn = yearOfBorn;
        this.ratePerHour = ratePerHour;
    }

    public String getName() { return name; }

    public void setName(String name){
        this.name = name;
    }
    public String getSurname() { return surname; }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYearOfBorn() { return yearOfBorn; }

    public void setYearOfBorn(int yearOfBorn) {
        this.yearOfBorn = yearOfBorn;
    }

    public int getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(int ratePerHour) {
        this.ratePerHour = ratePerHour;
    }
}
