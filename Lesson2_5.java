package ru.geekbrains;

public class Lesson2_5 {
    //** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
    public static void main(String[] args) {
        int[] maxMin = {4, 5, 3, 3, 8, 4, 10, 8, 4, 9, 4, 5};
        int max = maxMin[0], min = maxMin[0];

        for (int j : maxMin) {
            if (j > max) max = j;
            if (j < min) {
                min = j;
            }
        }
        System.out.println("Максимальное значение массива " + max);
        System.out.println("Минимальное значение массива " + min);
    }
}

