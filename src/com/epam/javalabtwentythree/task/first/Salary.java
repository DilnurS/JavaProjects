package com.epam.javalabtwentythree.task.first;

//*
/* Расчёт заработной платы, для разных структурных единиц.
*/

    public class Salary {
        public static void main (String[] args) {
            Director director = new Director("Ivan", "Ivanov", 1980, 300);
            director.printSalary();

            Accountant accountant = new Accountant("Erzhan", "Almasov",1996, 200);
            accountant.printSalary();

            Driver driver = new Driver("Petya","Petrov", 1985, 100);
            driver.printSalary();

            Salesman salesman = new Salesman("Vasya", "Pupkin", 1990, 250);
            salesman.printSalary();
        }
    }
