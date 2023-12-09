package ua.paik.hw10;
import java.util.Optional;

public class Task3 {
    private static final String[] PHONE_BOOK = new String[3];

    public static void main(String[] args) {
        PHONE_BOOK[0] = "016/161616";
        PHONE_BOOK[1] = "016/161617";
        PHONE_BOOK[2] = "016/161618";

        Optional<Integer> index1 = findIndexByPhoneNumber("016/161617");
        System.out.println("Index of 016/161617: " + index1.orElse(-1));

        Optional<Integer> index2 = findIndexByPhoneNumber("016/161619");
        System.out.println("Index of 016/161619: " + index2.orElse(-1));
    }

    public static Optional<Integer> findIndexByPhoneNumber(String phoneNumber) {
        for (int i = 0; i < PHONE_BOOK.length; i++) {
            if (PHONE_BOOK[i] != null && PHONE_BOOK[i].equals(phoneNumber)) {
                return Optional.of(i);
            }
        }
        return Optional.empty();
    }
}
