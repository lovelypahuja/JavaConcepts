package JavaConcepts.JavaConcepts;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ThirdLargestNumberInArray {
    //Given an unsorted array of integers, find the third largest number in the array.
    //If the array has less than three distinct numbers, return the largest number.
    //Example: Input: arr = [2, 4, 1, 5,3,6-/*]+
    // Output: 4
    public static void main(String[] args) {


        List<Integer> number = Arrays.asList(5, 5, 5, 5,5, 6, 6);
        int Result = number.stream().distinct().sorted(Comparator.reverseOrder()).skip(2).findFirst().orElse(-1);
        Optional<Integer> Result1=number.stream().distinct().sorted(Comparator.reverseOrder()).skip(2).findFirst();
        System.out.println(Result);
        System.out.println(Result1);
        if(Result1.isPresent())
        {
            int max= Result1.get();



        }
    }
}
