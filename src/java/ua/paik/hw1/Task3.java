package ua.paik.hw1;

// ua.paik.hw1.Task3
public class Task3 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        System.out.println("Before change:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After change:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}





