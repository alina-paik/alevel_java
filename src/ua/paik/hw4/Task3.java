package ua.paik.hw4;

import java.util.concurrent.ThreadLocalRandom;

public class Task3 {
    public static void main(String[] args) {
        int[] array = fillArray(2000, 1, 100);

        System.out.println("Input array:");
        printArray(array);

        int[] modifiedArray = replaceEvenWithZero(array);

        System.out.println("Array after replacing even integers with zeros:");
        printArray(modifiedArray);
    }

    public static int[] fillArray(int size, int min, int max) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(min, max + 1);
        }
        return array;
    }

    public static int[] replaceEvenWithZero(int[] array) {
        int[] newArray = array.clone();

        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] % 2 == 0) {
                newArray[i] = 0;
            }
        }

        return newArray;
    }

    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
