package JavaConcepts;

public class ReverseNumber {
    public static void main(String[] args) {
        int number = 102;
        int reverse = 0;
        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }
        System.out.println(reverse);
    }
}