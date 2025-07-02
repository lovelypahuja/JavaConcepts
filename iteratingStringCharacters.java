package JavaConcepts;

import org.w3c.dom.ls.LSOutput;

public class iteratingStringCharacters {
    public static void main(String[] args) {
        String fname="lovely pahuja";
        for(int i=0; i<fname.length();i++){
            System.out.println(fname.charAt(i));
        }
    }
}
