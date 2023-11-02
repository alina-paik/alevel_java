package ua.paik.hw2;

// робила за допомогою chat gpt, сама не осилила

public class Task2 {
    public static void main(String[] args) {
            double x1 = 1, y1 = 5;
            double x2 = 3, y2 = 5;
            double x3 = 6, y3 = 7;

            double AB = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
            double BC = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
            double CA = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));

            double s = (AB + BC + CA) / 2;

            double triangleArea = Math.sqrt(s * (s - AB) * (s - BC) * (s - CA));

            System.out.println("Площадь треугольника: " + triangleArea);
    }
}




