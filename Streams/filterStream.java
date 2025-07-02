package JavaConcepts.Streams;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class filterStream {
    static List<Integer> numbers= Arrays.asList(1,2,3,4,5,6,7,8);
    static List<Integer> Result= numbers.stream().filter(n->n>5).collect(Collectors.toList());
    static List<Integer> Result1= numbers.stream().filter(n->n!=5).collect(Collectors.toList());
    static List<Integer> Result2= numbers.stream().filter(n->n%5==0).collect(Collectors.toList());
   static List<Integer> Result3= numbers.stream().filter(n->n%2==0).collect(Collectors.toList());
    static
    Map<Boolean,List<Integer>> Result4= numbers.stream().collect(Collectors.partitioningBy(n->n%2==0));
   static
   long count= numbers.stream().collect(Collectors.counting());
   static IntSummaryStatistics stats= numbers.stream().collect(Collectors.summarizingInt(Integer::intValue));

    public static void main(String[] args) {
        Map<Boolean, List<Integer>> groupedByEvenOdd = numbers.stream()
                .collect(Collectors.groupingBy(n -> n % 2 == 0,
                        Collectors.filtering(n -> n > 2, Collectors.toList())));

        System.out.println(groupedByEvenOdd);
        System.out.println(Result);
        System.out.println(Result1);
        System.out.println(Result2);
        System.out.println(Result3);
        System.out.println(Result4);
        System.out.println(count);
        System.out.println(stats);
        System.out.println(stats.getMax()+" "+stats.getAverage());

    }

}
