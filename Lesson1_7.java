package ru.geekbrains;

import java.util.Scanner;

public class HomeWork1_7 {
    //Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»;

    public static void a(String name){
        System.out.println("Привет, " + name + "!");

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя");
        String num = in.nextLine();
        a(num);
    }
}
