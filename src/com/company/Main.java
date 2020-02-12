package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("\nВывод элементов массива");
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 20) - 10);
            System.out.print(array[i] + " ");
        }
        System.out.println("\nВычитание числа 6 из элементов массива");
        for (int i = 0; i < array.length; i++)
        {
            array[i] = array[i] - 6;
            System.out.print(array[i] + " ");
        }
        System.out.println("\nОбнуление элементов массива");
        for (int i = 0; i < array.length; i++)
        {
            array[i] = 0;
            System.out.print(array[i] + " ");
        }
        System.out.println("\nЗамена элементов массива на число 89");
        for (int i = 0; i < array.length; i++)
        {
            array[i] = 89;
            System.out.print(array[i] + " ");
        }
    }
}
