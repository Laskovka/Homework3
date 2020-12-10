package com.alevel.homework3;

public class Task4 {
    public static void main(String[] args) {
        int length = 2000;
        int[] array = new int[length];
        System.out.println("Array before changes.");
        for (int i = 0; i < length; i++) {
            array[i] = (int) ((Math.random() * (100)) + 1);
            System.out.print(array[i] + " ");
        }
        System.out.println("\nArray after changes.");
        for (int i = 0; i < length; i++) {
            if(array[i] % 2 == 0) {
                array[i] = 0;
            }
            System.out.print(array[i] + " ");
        }
    }
}
