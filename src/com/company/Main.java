package com.company;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 20) - 10);
            System.out.print(array[i] + " ");
        }
        System.out.println("\nУмножение элементов массива на 3");
        for (int i = 0; i < array.length; i++)
        {
            array[i] = array[i] * 3;
            System.out.print(array[i] + " ");
        }
        System.out.println("\nОбнуление элементов массива");
        for (int i = 0; i < array.length; i++)
        {
            array[i] = 0;
            System.out.print(array[i] + " ");
        }
    }
}