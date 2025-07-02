package JavaConcepts.Concepts;

public class nearestPalindrome1 {
    public static void main(String[] args) {
        int num=111;
        System.out.println(nearestPalindrome1(num));
    }

    public static boolean IsPalindrome1(int num) {
        int Originalnum = num;
        int ReversedNum = 0;

        while (num > 0) {
            int digit = num % 10;
            ReversedNum = ReversedNum * 10 + digit;
            num /= 10;
        }
        return Originalnum == ReversedNum;

    }

    public static int nearestPalindrome1(int n) {
        if (IsPalindrome1(n))
            return n;
        int lower = n - 1;
        int upper = n + 1;
        while (true) {
            if (IsPalindrome1(lower))
                return lower;

            if (IsPalindrome1(upper))
                return upper;
            lower--;
            upper++;
        }
    }
}
