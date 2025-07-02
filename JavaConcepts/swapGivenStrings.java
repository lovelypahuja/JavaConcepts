package JavaConcepts.JavaConcepts;

public class swapGivenStrings {
    public static void main(String[] args) {
       String str1="Lovely";
       String str2="Pahuja";
       str1= str1+str2;//LovelyPahuja
       // int i=str1.length()-str2.length();
       str2=(str1.substring(0,str1.length()-str2.length()));
        System.out.println("str2 is"+str2);
        str1= str1.substring(str2.length());
        System.out.println("str1 is"+str1);

    }
}
