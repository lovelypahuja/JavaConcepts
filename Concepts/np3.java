package JavaConcepts.Concepts;

public class np3 {
    public static void main(String[] args) {

        System.out.println(nearestPlindrome3(123));


}
public static int nearestPlindrome3(int n){
     int lower=n-1;
     int higher=n+1;
     if(IsPalindrome(n))
         return n;
     while(true) {
         if (IsPalindrome(lower))
             return lower;
         else if (IsPalindrome(higher))
             return higher;
         lower--;
         higher++;
     }

}
    public static boolean IsPalindrome(int num){
        int Original=num;
        int reversed=0;
        while(num>0){
            int digit=num%10;
            reversed=reversed*10+digit;
            num/=10;
        }
        return Original==reversed;
    }
}
