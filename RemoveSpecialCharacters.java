package JavaConcepts;
//    //    static String str="lovely123@Pahuja";
////    static String cleaned=str.replaceAll("[^a-zA-Z]","");
////        System.out.println(cleaned);
////    static String Forpalaindrome=cleaned.toLowerCase();
////
////    public static boolean IsPalindrome(){
////        int left=0;
////        int right=Forpalaindrome.length()-1;
////    }
////        while (left>right){
////            if(Forpalaindrome.charAt(left)!=Forpalaindrome.charAt(right))
////                return false;
////        }
////}
////    public static void main(String[] args) {
////
////
////    }
public class RemoveSpecialCharacters {
    public static void main(String[] args) {
        String str = "Lovely@123Pahuja";
        String cleaned= str.replaceAll("[^a-zA-Z]","");
        String forPalindrome=cleaned.toLowerCase();

        int left=0;
        int right=forPalindrome.length()-1;
        boolean IsPalindrome=true;
        while(left<right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                IsPalindrome = false;
                break;
            }
            left++;
            right--;

        }
        if(IsPalindrome)
            System.out.println("it is palindrome");
        else
            System.out.println("it is not a palindorme");


    }



}
