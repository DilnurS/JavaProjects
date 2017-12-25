package com.epam.javalabtwentythree.task.first;

public class Driver extends Employee implements PaymentForMonth{

    Driver(String name, String surname, int yearOfBorn, int ratePerHour) {
        super(name, surname, yearOfBorn, ratePerHour);
    }

    public int payPerMonth() { // payment per Month
        return hour*workDays*week* getRatePerHour();
    }

    public void printSalary() {

        System.out.println("Driver is: " + this.getName()+" "+this.getSurname()+" "+" "
                +this.getYearOfBorn()+ "\n" + "Driver payment is: " +payPerMonth()+"kzt");
    }
}