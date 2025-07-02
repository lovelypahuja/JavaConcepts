package JavaConcepts.Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ThirdLargestNumberIntArray {

    public static void main(String[] args) {
        int[] numbers= {1,2,3,4,5,6};

        int ThirdLargestNumber= Arrays.stream(numbers).
                boxed().
                sorted(Comparator.reverseOrder()).skip(2).findFirst().orElseThrow(RuntimeException::new);
        System.out.println(ThirdLargestNumber);
        //Optional.ispresent
        //Optional.get

        List<String> words= Arrays.asList("Apple","Banana","Cherry");
       String[] result= words.toArray(String[]::new);
        System.out.println(Arrays.toString(result));
        String result1= words.stream().collect(Collectors.joining(","));
        String result2= words.stream().collect(Collectors.joining(",","[","]"));
        System.out.println(result1);
        System.out.println(result2);
    }
}
