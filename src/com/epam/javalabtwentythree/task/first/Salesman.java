package com.epam.javalabtwentythree.task.first;
/**
 *вывод на печать, расчёта зарплаты
 */

public class Salesman extends Employee implements PaymentForMonth {

    Salesman(String name, String surname, int yearOfBorn, int ratePerHour) {
        super(name, surname, yearOfBorn, ratePerHour);
    }

    public int payPerMonth() { // Payment per Month
        return hour*workDays*week* getRatePerHour();
    }

    public void printSalary() {

        System.out.println("Salesman is: " + this.getName()+" "+this.getSurname()+" "+" "
                +this.getYearOfBorn()+ "\n" + "Salesman payment is: " +payPerMonth()+"kzt");
    }
}

