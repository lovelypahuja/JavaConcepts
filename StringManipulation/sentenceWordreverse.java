package JavaConcepts.StringManipulation;

public class sentenceWordreverse {
    public static void main(String[] args) {
        String str= "welcome to the world";
        String reversed= "";

        //first way using string builder
        //StringBuilder reversed= new StringBuilder(str);
        //System.out.println(reversed.reverse().toString());

        //second way without string builder
        for(int i=str.length()-1; i>=0;i--){
           reversed+=str.charAt(i);
        }
        System.out.println(reversed);
    }
}
