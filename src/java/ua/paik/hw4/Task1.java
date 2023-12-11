package ua.paik.hw4;

import java.util.concurrent.ThreadLocalRandom;

public class Task1 {
    public static void main(String[] args) {
        int[] array = fillArray(400, 1, 10);

        int[] arrayCopy = array.clone();
        double arithmeticMean = calculateArithmeticMean(arrayCopy);
        double geometricMean = calculateGeometricMean(arrayCopy);

        System.out.println("Initial array:");
        printArray(array);
        System.out.println("Arithmetic mean: " + arithmeticMean);
        System.out.println("Geometric mean: " + geometricMean);
    }

    public static int[] fillArray(int size, int min, int max) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(min, max + 1);
        }
        return array;
    }

    public static double calculateArithmeticMean(int[] array) {
        double sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum / array.length;
    }

    public static double calculateGeometricMean(int[] array) {
        double result = 1;
        for (int value : array) {
            result *= value;
        }
        return Math.pow(result, 1.0 / array.length);
    }

    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
