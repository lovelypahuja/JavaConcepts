package JavaConcepts.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

public class predicate {
    public static void main(String[] args) {
        Predicate<String> startwithA= str->str.startsWith("A");
        System.out.println(startwithA.test("Apple"));
        System.out.println(startwithA.test("Banana"));

//        List<String> names= Arrays.asList( "alice","anthony","wonder");
//       names.stream().filter(name -> name.startsWith("A")).forEach(System.out::println);
//        names.stream()
//                .filter(name -> name.startsWith("A")) // Predicate used here
//                .forEach(System.out::println);
        List<String> names = Arrays.asList("Alice", "Bob", "Anita");

        names.stream()
                .filter(name -> name.startsWith("A")) // Predicate used here
                .forEach(System.out::println);
        BiConsumer<String,Integer> keyvalue=(key,value)-> System.out.println(key+value);

        keyvalue.accept("age",30);


    }
}
