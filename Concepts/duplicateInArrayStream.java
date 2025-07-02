package JavaConcepts.Concepts;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class duplicateInArrayStream {
    public static void main(String[] args) {
        int[] numberArray={1,2,3,4,4,4,5,5,5,5,6,7,7};
        List<Integer> result=Arrays.stream(numberArray).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet()
                .stream().filter(e->e.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(result);
      //  Map<Integer,Long>= Arrays.stream(numberArray).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().
               // stream().filter(e->e.getValue()>1).map(Map.Entry)'
        List<Integer> result1= Arrays.stream(numberArray).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream()
                .filter(e->e.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toList());
    }
}
