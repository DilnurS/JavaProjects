package com.epam.javalabtwentythree.task.first;

public class Accountant extends Employee implements PaymentForMonth {

    public int payPerMonth() { // Payment per Month
        return hour*workDays*week* getRatePerHour();
    }

    Accountant(String name, String surname, int yearOfBorn, int ratePerHour) {
        super(name, surname, yearOfBorn, ratePerHour);
    }

    public void printSalary() {

        System.out.println("Accountant is: " + this.getName()+" "+this.getSurname()+" "+" "
                +this.getYearOfBorn()+ "\n" + "Accountant payment is: " +payPerMonth()+"kzt");
    }
}