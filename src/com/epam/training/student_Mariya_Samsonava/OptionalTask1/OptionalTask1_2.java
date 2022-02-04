package com.epam.training.student_Mariya_Samsonava;

import java.util.Arrays;
import java.util.Scanner;

public class OptionalTask1_2 {

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

        bubbleSort(array);
    }

    static void bubbleSort(String[] array){
        int comparisonsDone = 0;
        int swapsDone = 0;
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i =0; i < array.length - 1; i++) {
                printArray(array);
                if (array[i].length() > array[i + 1].length()) {
                    System.out.println("Перемещение " + array[i] + " и " + array[i+1]);
                    String temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    swapsDone++;
                    sorted = false;
                } else {
                    System.out.println("Изменения не нужны для элементов " + i + " и " +(i+1));
                }
                comparisonsDone++;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    static void printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            System.out.print(" ");
        }
        System.out.println();
    }
}
