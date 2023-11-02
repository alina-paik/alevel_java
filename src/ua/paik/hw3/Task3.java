package ua.paik.hw3;

public class Task3 {
    public static void main(String[] args) {
        String text = "   text string a b c str text      ";
        String trimmedString = text.trim();

        String[] words = trimmedString.split(" ");

        int wordCount = words.length;

        System.out.println(wordCount);
    }
}

