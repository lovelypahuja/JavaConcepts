package JavaConcepts.Concepts;

public class NearestPalindrone2 {

    public static boolean IsPalindrome2(int num){
        int OriginalNumber=num;
        int ReversedNumber=0;
        while(num>0){
            int digit=num%10;
            ReversedNumber=ReversedNumber*0+digit;
            num/=10;
        }
        return OriginalNumber==ReversedNumber;
    }
//    public static int nearestPalindrome2(int n) {
//       if(IsPalindrome2(n))
//        return n;
//        int lower=n-1;
//        int higher=n+1;
//        while(true){
//            IsPalindrome2(lower)
//            return lower;
//            IsPalindrome2(higher)
//            return higher;
//            lower--;
//            higher++;
//        }
//
//    }
}
//   public static int nearestPalindrome1(int n) {
//        if (IsPalindrome1(n))
//            return n;
//        int lower = n - 1;
//        int upper = n + 1;
//        while (true) {
//            if (IsPalindrome1(lower))
//                return lower;
//
//            if (IsPalindrome1(upper))
//                return upper;
//            lower--;
//            upper++;
//        }
//    }
