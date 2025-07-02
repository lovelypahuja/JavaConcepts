package JavaConcepts.Concepts;

public class nearestPalindromeAlphabet {


    public static boolean IsPalindromeAlphabet(String str){
        str= str.replaceAll("[^a-zA-Z]","").toLowerCase();
        int left=0;
        int right= str.length()-1;
        while(left<right)
        {
            if(str.charAt(left)!=str.charAt(right)){
                return false;
        }
        left++;
            right--;

    }
        return true;

}
    public static void main(String[] args) {

        String s="Levem";
        System.out.println(IsPalindromeAlphabet(s));}
    }



