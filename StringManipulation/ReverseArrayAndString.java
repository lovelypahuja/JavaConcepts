package JavaConcepts.StringManipulation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.lang.String.join;

public class ReverseArrayAndString {

    public static void main(String[] args) {
        String testString="Welcome to school";
        String[] testArray={"welcome","to","school"};
        System.out.println(Arrays.toString(reverseArray1(testArray)));
        System.out.println(reverseString1(testString));


    }

    private static String[] reverseArray1(String[] testArray) {
        List<String> arrList= Arrays.asList(testArray);
        Collections.reverse(arrList);
        String[] reversedArray= arrList.toArray(new String[0]);
        return reversedArray;
    }

    private static String reverseString1(String testString) {
       String[] arrString= testString.split(" ");
        List<String> StringList=Arrays.asList(arrString);
        Collections.reverse(StringList);
        join(" ",StringList);

        return String.join(" ",StringList);
    }

}
