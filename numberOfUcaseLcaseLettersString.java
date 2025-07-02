package JavaConcepts;

public class numberOfUcaseLcaseLettersString {
    public static void main(String[] args) {
        String s="AAaBBCCcDD";
        int UpperCase=0;
        int LowerCase=0;
        //char ch[]=s.toCharArray();
        for(char ch: s.toCharArray()){
            if(Character.isUpperCase(ch))
                UpperCase++;
            if(Character.isLowerCase(ch))
                LowerCase++;


        }
        System.out.println("Uppercase count is "+UpperCase);
        System.out.println("LowerCase count is "+LowerCase);
    }
}
