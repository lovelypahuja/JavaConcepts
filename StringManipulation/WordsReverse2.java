package JavaConcepts.StringManipulation;

public class WordsReverse2 {
    public static void main(String[] args) {
        String str= "Welcome to the school";
        String words[]= str.split(" ");
        StringBuilder reversed= new StringBuilder();
        for(int i=words.length-1;i>=0;i--)
        {
            reversed.append(words[i]);
            if(i!=0)reversed.append(" ");
        }
        System.out.println(reversed.toString());
    }
}
