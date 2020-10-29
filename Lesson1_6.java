package ru.geekbrains;

import java.util.Scanner;

public class HomeWork1_6 {
    //Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное;

    private static boolean add(int a){
        if ( a > 0) return false;
        else return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int num = in.nextInt();
        System.out.println(add(num));
    }








}
