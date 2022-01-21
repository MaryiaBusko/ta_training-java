package com.epam.training.student_Mariya_Samsonava;

import java.util.Scanner;

public class MainTask_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите номер месяца: ");
        int month = in.nextInt();
            String monthString;
            switch (month) {
                case 1:
                    monthString = "Январь";
                    break;
                case 2:
                    monthString = "Февраль";
                    break;
                case 3:
                    monthString = "Март";
                    break;
                case 4:
                    monthString = "Апрель";
                    break;
                case 5:
                    monthString = "Май";
                    break;
                case 6:
                    monthString = "Июнь";
                    break;
                case 7:
                    monthString = "Июль";
                    break;
                case 8:
                    monthString = "Август";
                    break;
                case 9:
                    monthString = "Сентябрь";
                    break;
                case 10:
                    monthString = "Октябрь";
                    break;
                case 11:
                    monthString = "Ноябрь";
                    break;
                case 12:
                    monthString = "Декабрь";
                    break;
                default:
                    monthString = "Попробуйте снова";
                    break;
            }
            System.out.println("Месяц под этим номером: " +monthString);
    }
}
