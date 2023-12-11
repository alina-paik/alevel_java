package ua.paik.hw4;

import java.util.concurrent.ThreadLocalRandom;

public class Task2 {
    public static void main(String[] args) {
        int[] array = fillArray(1000, 1, 100);
        int[] arrayCopy = new int[array.length];
        System.arraycopy(array, 0, arrayCopy, 0, array.length);
        int primeCountInit = countPrimes(array);
        int primeCountCopy = countPrimes(arrayCopy);

        System.out.println("Number of prime numbers in the array: " + primeCountInit);
        System.out.println("Number of prime numbers in the arraycopy: " + primeCountCopy);
    }

    public static int[] fillArray(int size, int min, int max) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(min, max + 1);
        }
        return array;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static int countPrimes(int[] array) {
        int primeCount = 0;
        for (int value : array) {
            if (isPrime(value)) {
                primeCount++;
            }
        }
        return primeCount;
    }
}
