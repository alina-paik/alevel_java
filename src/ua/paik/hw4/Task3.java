package ua.paik.hw4;

import java.util.concurrent.ThreadLocalRandom;

public class Task3 {
    public static void main(String[] args) {
        int[] array = fillArray(2000, 1, 100);

        System.out.println("Input array");
        printArray(array);

        replaceEvenWithZero(array);

        System.out.println("Array after replacing even integers with zeros:");
        printArray(array);
    }
    public static int[] fillArray(int size, int min, int max) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(min, max + 1);
        }
        return array;
    }

    public static void replaceEvenWithZero(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[i] = 0;
            }
        }
    }

    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
