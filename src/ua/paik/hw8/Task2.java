package ua.paik.hw8;

interface Pow {
    int pow(int number, int exponent);
}
public class Task2 {
    public static void main(String[] args) {
        Pow powFunction = (number, exponent) -> {
            int result = 1;
            for (int i = 0; i < exponent; i++) {
                result *= number;
            }
            return result;
        };

        int base = 4;
        int power = 2;

        int result = powFunction.pow(base, power);
        System.out.println(base + " to the power " + power + " = " + result);
    }
}
