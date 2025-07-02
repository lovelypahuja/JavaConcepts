package JavaConcepts.StringArrayReverse;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class arrayReverse {
    public static void main(String[] args) {


        String[] array = {"hello", "world"};
        List<String> arrlist = Arrays.asList(array);
        Collections.reverse(arrlist);
        String[] reversed = arrlist.toArray(new String[0]);
        System.out.println(Arrays.toString(reversed));
    }
}
