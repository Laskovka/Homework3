package com.alevel.homework3;

public class Task1 {
    public static void main(String[] args) {
        int length = 400;
        int[] array = new int[length];
        int average = 0;
        int geometricMean = 1;
        for (int i = 0; i < length; i++) {
            array[i] = (int) ((Math.random()*(3)) + 1);
            average+=array[i];
            geometricMean*=array[i];
        }
        System.out.println("Average - " + average/400);
        System.out.println("Geometric mean - " + Math.pow(geometricMean, 1.0/length));
    }
}
