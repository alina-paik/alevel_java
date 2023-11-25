package ua.paik.hw9;

public class ExceptionExample {
    public static void main(String[] args) {
        try {
            throwException();
        } catch (Exception e) {
            System.out.println("Caught exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block completed");
        }
    }
    public static void throwException() throws Exception {
        throw new Exception("It's a custom exception message");
    }
}

