package com.epam.javalabtwentythree.task.third;

//*

/* Задание №3: замена первого и последнего слова в строке.
 */

import java.io.*;
import java.util.*;

public class WorkWithString {

    public static void main(String[] args) throws FileNotFoundException {

        try (FileWriter writer = new FileWriter("D:\\NetBeansProjects\\third.txt", false)) {
            // запись всей строки
            String text = "Улыбок тебе дед Макар.";
            writer.write(text);
            // запись по символам
            writer.append('\n');
            writer.flush();
            System.out.println(text);
        }
        catch (IOException ex) {

            System.out.println(ex.getMessage());
        }

        String text="D:\\NetBeansProjects\\third.txt";
        File file= new File(text);

        Scanner scanner=new Scanner(file); //инициализация чтения файла
        String line = scanner.nextLine();
        String[] sentence = line.split(" "); //разбивка на слова

        /*System.out.println(Arrays.toString(sentence));*/

        String lastElement = sentence[sentence.length-1];
        sentence[sentence.length-1]=sentence[0];
        sentence[0]=lastElement;

        System.out.println(Arrays.toString(sentence));

        scanner.close();
    }
}