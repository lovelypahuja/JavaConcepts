package JavaConcepts.StringManipulation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class reversingArrayAndString {
    public static void main(String[] args) {
        String str= "welcome to school";
        String[] array={"welcome", "To", "school"};
        String StrReverse= StringReverse(str);
        String[] arrReverse= ArrayReverse(array);
        System.out.println(StrReverse);
        System.out.println(Arrays.toString(arrReverse));

    }
            static StringBuilder strB= new StringBuilder();
    private static String[] ArrayReverse(String[] array) {

        List<String> arr= Arrays.asList(array);
        Collections.reverse(arr);
        String [] array1=arr.toArray(new String[0]);
        //System.out.println(array);
        return array1;
    }

    private static String StringReverse(String str) {
        String[] arrStr= str.split(" ");
        List<String> strL= Arrays.asList(arrStr);
        Collections.reverse(strL);
        String strr= strL.toString();
        return strr;
    }
}
