package JavaConcepts.Streams;

import java.util.Arrays;
import java.util.List;

public class allMatchStream {

    public static List<Integer> numbers= Arrays.asList(-1,-2,-3,4,5,-6,-7);
    public static boolean ResultPositive= numbers.stream().allMatch(n->n>0);
    public static boolean ResultPositive1= numbers.stream().anyMatch(n->n>0);
    public static boolean ResultPositive2= numbers.stream().noneMatch(n->n>0);

    public static void main(String[] args) {
        System.out.println(ResultPositive);
        System.out.println(ResultPositive1);
        System.out.println(ResultPositive2);;
    }
}
