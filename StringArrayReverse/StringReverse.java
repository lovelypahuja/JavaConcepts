package JavaConcepts.StringArrayReverse;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringReverse {
    public static void main(String[] args) {
        String str="welcome to school";
        String reversed=" ";
        String[] arr=str.split(" ");
        List<String> arrlist= Arrays.asList(arr);
        Collections.reverse(arrlist);
        reversed=String.join(" ",arrlist);
        System.out.println(reversed);

    }
}
