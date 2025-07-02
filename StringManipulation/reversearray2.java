package JavaConcepts.StringManipulation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class test {
    public static void main(String[] args) {
        String str="welcome to school";

        String result= reverseString4(str);
        System.out.println(result);
    }

    private static String reverseString4(String str) {
        String[] arr=str.split(" ");
        List<String> stringList=Arrays.asList(arr);
        Collections.reverse(stringList);
        String st= String.join(" ",stringList);
        return st;

    }
    }
