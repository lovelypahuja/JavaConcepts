package JavaConcepts.StringManipulation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class reverseArray {
    public static void main(String[] args) {


        //String [] arr = {"hello","java"};
//output - {"avaj","olleh"}
        String[] arr = {"hello", "java"};
        List<String> reversed = Arrays.asList(arr);
       // char[] ch= arr[1].toCharArray();
        Collections.reverse(reversed);
        System.out.println(reversed);
        //StringBuilder reversed1= new StringBuilder(String.valueOf(arr));
        //reversed1.reverse().toString();
       // System.out.println(reversed1);

    }
}
