package ua.paik.hw7;

import java.util.Arrays;
        import java.util.Random;

public class Vector3D {
    private final double x;
    private final double y;
    private final double z;

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double calculateLength() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public Vector3D crossProduct(Vector3D other) {
        double newX = y * other.z - z * other.y;
        double newY = z * other.x - x * other.z;
        double newZ = x * other.y - y * other.x;
        return new Vector3D(newX, newY, newZ);
    }

    public double calculateCosineAngle(Vector3D other) {
        double dotProduct = x * other.x + y * other.y + z * other.z;
        double lengthProduct = calculateLength() * other.calculateLength();
        return dotProduct / lengthProduct;
    }

    public Vector3D add(Vector3D other) {
        return new Vector3D(x + other.x, y + other.y, z + other.z);
    }

    public Vector3D subtract(Vector3D other) {
        return new Vector3D(x - other.x, y - other.y, z - other.z);
    }

    public static Vector3D[] generateRandomVectors(int N) {
        Vector3D[] vectors = new Vector3D[N];
        Random random = new Random();

        for (int i = 0; i < N; i++) {
            double x = random.nextDouble();
            double y = random.nextDouble();
            double z = random.nextDouble();
            vectors[i] = new Vector3D(x, y, z);
        }

        return vectors;
    }

    @Override
    public String toString() {
        return "[" + x + ", " + y + ", " + z + "]";
    }

    public static void main(String[] args) {
        Vector3D vector1 = new Vector3D(1, 2, 3);
        Vector3D vector2 = new Vector3D(4, 5, 6);

        System.out.println("Vector1: " + vector1);
        System.out.println("Vector2: " + vector2);
        System.out.println("Length of Vector1: " + vector1.calculateLength());
        Vector3D crossProduct = vector1.crossProduct(vector2);
        System.out.println("Cross Product of Vector1 and Vector2: " + crossProduct);

        double cosineAngle = vector1.calculateCosineAngle(vector2);
        System.out.println("Cosine Angle between Vector1 and Vector2: " + cosineAngle);

        Vector3D sum = vector1.add(vector2);
        System.out.println("Sum of Vector1 and Vector2: " + sum);

        Vector3D difference = vector1.subtract(vector2);
        System.out.println("Difference between Vector1 and Vector2: " + difference);

        int N = 5;
        Vector3D[] randomVectors = Vector3D.generateRandomVectors(N);
        System.out.println("Random Vectors:");
        System.out.println(Arrays.toString(randomVectors));
    }
}
