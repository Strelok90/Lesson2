package ru.geekbrains;

import java.util.Scanner;

public class HomeWork1_4 {
    //Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;

    public static boolean add(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            System.out.println("Число " + sum + " входит в диапозон от 10 до 20");
            return true ;
        } else
            System.out.println("Число " + sum + " Не входит в диапозон от 10 до 20");
            return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число");
        int num1 = in.nextInt();
        System.out.println("Введите второе число");
        int num2 = in.nextInt();
        System.out.println(add(num1,num2));
    }
}
