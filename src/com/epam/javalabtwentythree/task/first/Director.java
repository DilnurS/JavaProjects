package com.epam.javalabtwentythree.task.first;

public class Director extends Employee implements PaymentForMonth {

    Director(String name, String surname, int yearOfBorn, int ratePerHour) {
        super(name, surname, yearOfBorn, ratePerHour);
    }

    public int payPerMonth() { // Payment per Month
        return hour*workDays*week* getRatePerHour();
    }

    public void printSalary() {

        System.out.println("Director is: " + this.getName()+" "+this.getSurname()+" "+" "
                +this.getYearOfBorn()+ "\n" + "Director payment is: " +payPerMonth()+"kzt");
    }
}