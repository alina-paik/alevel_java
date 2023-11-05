package ua.paik.hw3;

public class Task3 {
    public static void main(String[] args) {
        String text = "                    text           string       a b c str      text      ";
        int wordCount = countWords(text);
        System.out.println(wordCount);
    }

    public static int countWords(String input) {
        String[] words = input.trim().split("\\s+");
        return words.length;

    }
}

