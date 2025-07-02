package JavaConcepts.Concepts;

public class cn1 {

    static int num=123;

    public static void main(String[] args) {
        int result=nearestPalindrome(num);
        System.out.println(result);

//        int num=27;
//        int limit=10000;
//        int result= IntStream.rangeClosed(-limit,limit).filter(i->i*i*i==num).findFirst().orElse(0);
//
//        if(result==0)
//            System.out.println("not a cube");
//            else System.out.println(num+" is a cube of"+result);
//nearestPalindrome




    }
    public static boolean IsPalindrome(int n) {
        int Original=n;
        int reversed=0;
        while (n > 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return Original==reversed;
    }
    public static int nearestPalindrome(int num) {
        int lower=num-1;
        int higher=num+1;
        if(IsPalindrome(num)){
            return num;
    }
        while(true) {
            if (IsPalindrome(lower))
                return lower;
            if (IsPalindrome(higher))
                return higher;
            lower--;
            higher++;
        }

    }
}
