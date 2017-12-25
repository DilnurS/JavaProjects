package com.epam.javalabtwentythree.task.second;

import java.util.Scanner;
//*

/* Задание №2: посчитать сумму всех чисел из заданного текста.
 */

public class SumOfDigit {

    public static void main(String[] args) {
        String s = " my 1 sec 2  ond 3 go 4 v 5 no 6 co 7 de 8 9 100 0 45 -50"; //заданный текст.
        Scanner scanner = new Scanner(s); //инициализация сканера.
        int sum = 0; // счётчик чисел
        while (scanner.hasNext()) { //цикл проверки текста на наличие чисел.
            if (scanner.hasNextInt()) {
                int i = scanner.nextInt(); //если, в тексте число найдено, присвоение числа элементу и переход к следующему элементу текста.
                sum = sum + i; // суммирование чисел.
            } else {
                scanner.next();
            }
        }
        System.out.println("Сумма чисел из заданного текста: = " + sum); //печать суммы всех чисел.
    }
}