package com.epam.training.student_Mariya_Samsonava;

import java.util.Arrays;
import java.util.Scanner;

public class OptionalTask1_1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите количество чисел, которые будут являтся элементами массива: ");
        int size = input.nextInt();
        String[] array = new String[size];

        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < size; i++) {
            array[i] = input.next();
        }
        System.out.println(Arrays.toString(array));

        printTheLongestAndTheShortestElement(array);

    }
    static void printTheLongestAndTheShortestElement(String[] array) {
        int shortest = array[0].length();
        int longest = 0;
        int indexShort = 0;
        int indexLong = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i].length() > longest) {
                longest = array[i].length();
                indexLong = i;
            } else if (array[i].length() < shortest) {
                shortest = array[i].length();
                indexShort = i;
            }
        }
        System.out.println("Самое длинное число: " + array[indexLong] + ", его длина: " + array[indexLong].length());
        System.out.println("Самое короткое число: " + array[indexShort] + ", его длина: " + array[indexShort].length());


    }

}
