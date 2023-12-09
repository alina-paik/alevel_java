package ua.paik.hw9;

public class Task2 {
    public static void main(String[] args) {
        try {
            f();
        } catch (Exception e) {
            System.out.println("Caught exception in main: " + e.getMessage());
        }
    }

    public static void f() throws Exception {
        try {
            g();
        } catch (Exception ex) {
            System.out.println("Caught exception in f: " + ex.getMessage());
            throw new AnotherException("Another exception thrown from f");
        }
    }

    public static void g() throws Exception {
        throw new Exception("Exception thrown from g");
    }
}

class AnotherException extends Exception {
    public AnotherException(String message) {
        super(message);
    }
}
