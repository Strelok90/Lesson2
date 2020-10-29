package ru.geekbrains;

import java.util.Scanner;

public class HomeWork1_8 {
    //* Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный

    public static void add(int year){
      /* if (year % 4 == 0) {
           System.out.println(year + " високосный");
           } else {
                if (year % 100 != 0){
                    if(year % 400 == 0)
                        System.out.println(year + " високосный");
                    else
                        System.out.println(year + " не високосный");
                } else
                    System.out.println(year + " не високосный");
            }
            */
        if((year % 4 == 0)||(year % 100 != 0)&&(year % 400 == 0)) System.out.println(year + " високосный");
        else System.out.println(year + " не високосный");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите год");
        int num = in.nextInt();
        add(num);
    }
}
