package ua.paik.hw3;

    public class Task2 {
        public static void main(String[] args) {
            String text = "a b c b a";
            System.out.println(text);
            String textWithoutSpaces = text.replace(" ", "");
            System.out.println(textWithoutSpaces);

            boolean isPalindrome = isPalindrome(textWithoutSpaces);

            if (isPalindrome) {
                System.out.println("String is palindrome");
            } else {
                System.out.println("String isn't palindrome");
            }
        }
        public static boolean isPalindrome(String str) {
            int left = 0;
            int right = str.length() - 1;

            while (left < right) {
                if (str.charAt(left) != str.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }

            return true;
        }
    }
