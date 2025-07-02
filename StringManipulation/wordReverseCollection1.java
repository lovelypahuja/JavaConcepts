package JavaConcepts.StringManipulation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class wordReverseCollection1 {
    public static void main(String[] args) {
        String str= "welcome to the school";
        String words[] =str.split(" ");
        List<String> reversed= Arrays.asList(str.split(" "));
        Collections.reverse(reversed);
        System.out.println(String.join(" ",reversed));

    }
}
