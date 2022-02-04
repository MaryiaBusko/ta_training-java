package com.epam.training.student_Mariya_Samsonava;

import java.util.Arrays;
import java.util.Scanner;

public class OptionalTask1_3 {

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

        searchInArray(array);
    }

    static void searchInArray(String[] array) {
        int sum = 0;
        int size = array.length;
        for (int i= 0; i < array.length; i++) {
            sum += array[i].length();
        }
        int middle = sum / size;
        for (int i = 0; i < middle; i++) {
            System.out.println("Элементы массива, длина которых меньше длины среднего значения длин всех элементов " + array[i]);
            System.out.println("Их длина " + array[i].length());
        }
    }
}
