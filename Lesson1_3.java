package ru.geekbrains;

public class HomeWork1_3 {
 //Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,где a, b, c, d – входные параметры этого метода;
    public static int add(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

    public static void main(String[] args) {
        System.out.println(add(10, 20,30,40));
    }
}
