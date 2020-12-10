package com.alevel.homework3;

public class Task3 {
    public static void main(String[] args) {
        int length = 1000;
        int[] array = new int[length];
        int count = 0;
        for (int i = 0; i < length; i++) {
            array[i] = (int) ((Math.random() * (100)) + 1);
            if (array[i] == 1) {
                count++;
            } else {
                for (int j = 2; j < array[i]; j++) {
                    if (array[i] % j == 0) {
                        count++;
                        break;
                    }
                }
            }
        }
        System.out.println("Count of composite numbers - " + count);
    }
}
