package ua.paik.hw14;

import java.util.concurrent.*;

public class PrimeCount {
    public static void main(String[] args) {
        int[] numbers = {2, 5, 8, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53};

        PrimeCounterThread thread1 = new PrimeCounterThread(numbers, 0, numbers.length / 2);
        PrimeCounterThread thread2 = new PrimeCounterThread(numbers, numbers.length / 2, numbers.length);
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int totalPrimes = thread1.getPrimeCount() + thread2.getPrimeCount();

        System.out.println("Total prime numbers: " + totalPrimes);
    }
}

class PrimeCounterThread extends Thread {
    private final int[] numbers;
    private final int start;
    private final int end;
    private int primeCount;

    public PrimeCounterThread(int[] numbers, int start, int end) {
        this.numbers = numbers;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for (int i = start; i < end; i++) {
            if (isPrime(numbers[i])) {
                primeCount++;
            }
        }
        System.out.println("Thread " + getId() + " found " + primeCount + " prime numbers.");
    }

    public int getPrimeCount() {
        return primeCount;
    }

    private boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
