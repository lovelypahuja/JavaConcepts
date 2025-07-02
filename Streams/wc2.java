package JavaConcepts.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class wc2 {
    public static void main(String[] args) {
        String str = "my name is lovely and lovely is my name ";
        Map<String,Long> WordCount= Arrays.stream(str.split("\\s+")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        WordCount.forEach((word,count)-> System.out.println(word+" : "+count));

        //A Predicate<T> represents a boolean-valued function (true or false) of one input argument.
        Predicate<String> startsWithA = str1 -> str1.startsWith("A");

        System.out.println(startsWithA.test("Apple"));  // true
        System.out.println(startsWithA.test("Banana")); // false

//        Predicate<String> StartswithA= str->str.startswithA
//                (system.out::println);
        List<String> names = Arrays.asList("Alice", "Bob", "Anita");

        names.stream()
                .filter(name -> name.startsWith("A")) // Predicate used here
                .forEach(System.out::println);

//A BiConsumer<T, U> represents an operation that accepts two input arguments and returns no result.


    }
}
