package JavaConcepts;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class thirdlargest {
    public static void main(String[] args) {
        int[] array= {1,2,2,3,4,5,6,7,7,8,9};


       int result= Arrays.stream(array).boxed().sorted(Comparator.reverseOrder()).skip(2).findFirst().orElse(-1);

        System.out.println(result);
    }
}
