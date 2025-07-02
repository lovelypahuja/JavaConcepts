package JavaConcepts.JavaConcepts;

public class NearestPalindrome {

    // Function to check if a number is palindrome
    public static boolean isPalindrome(int num) {
        int originalNum = num;
        int reversedNum = 0;

        // Reverse the number
        while (num > 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }

        return originalNum == reversedNum;
    }

    // Function to find the nearest palindrome
    public static int nearestPalindrome(int n) {
        // If the number is already a palindrome, return it
        if (isPalindrome(n)) {
            return n;
        }

        int lower = n - 1;
        int higher = n + 1;

        // Check both lower and higher numbers until we find a palindrome
        while (true) {
            if (isPalindrome(lower)) {
                return lower;
            }
            if (isPalindrome(higher)) {
                return higher;
            }
            lower--;
            higher++;
        }
    }

    public static void main(String[] args) {
        int num1 = 115;
        int num2 = 117;

        System.out.println("Nearest palindrome to " + num1 + " is " + nearestPalindrome(num1));
        System.out.println("Nearest palindrome to " + num2 + " is " + nearestPalindrome(num2));
    }
}
