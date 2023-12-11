package ua.paik.hw2;

public class Task4 {
    public static void main(String[] args) {
        double num1 = -5;
        double num2 = 7;
        double num3 = 11;

        double absNum1 = Math.abs(num1);
        double absNum2 = Math.abs(num2);
        double absNum3 = Math.abs(num3);

        if (absNum1 <= absNum2 && absNum1 <= absNum3) {
            System.out.println(num1);
        } else if (absNum2 <= absNum1 && absNum2 <= absNum3) {
            System.out.println(num2);
        } else {
            System.out.println(num3);
        }
    }
}
