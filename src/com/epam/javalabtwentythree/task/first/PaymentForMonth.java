package com.epam.javalabtwentythree.task.first;
//*
/* Интерфейс, с указанием переменных, для данного задания - расчёт месячной зарплаты.
 */


interface PaymentForMonth {

   /* int ratePerHour();// Оплата за час.*/
    int hour = 8; //Hour per Day (кол-во рабочих часов).
    int workDays = 5; //Days per Week (кол-во рабочих дней в неделе).
    int week = 4; // Week per Month (кол-во недель в месяце).
    int payPerMonth();// Payment per Month (оплата за месяц).
}