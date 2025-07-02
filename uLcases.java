package JavaConcepts;

public class uLcases {
    public static void main(String[] args) {
        String s="aAAAbbbbABABABkkfhfh";
        int Uppercase=0;
        int Lowercase=0;

        for(char ch:s.toCharArray()){
            if(Character.isUpperCase(ch))
                Uppercase++;
            if(Character.isLowerCase(ch))
               Lowercase++;

        }
        System.out.println("no. of Lowercase letters are "+Lowercase);
        System.out.println("no. of Uppercase letters are "+Uppercase);
    }
}
