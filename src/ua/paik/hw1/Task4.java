package ua.paik.hw1;

public class Task4 {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        System.out.println("Before change:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After change:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

