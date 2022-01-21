package com.epam.training.student_Mariya_Samsonava;

public class MainTask_4 {
    public static void main(String[] args){
        int sum = 0;
        for(int i = 0; i < args.length; i++){
            System.out.println("Введены целые числа: " + args[i]);
            sum = sum + Integer.parseInt(args[i]);
        }
        System.out.println("Сумма итоговых аргументов равна " + sum);

    }
}
