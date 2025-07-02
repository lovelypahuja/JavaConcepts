package JavaConcepts.Streams;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LambaDemo {



    public static void main(String[] args) {
        BiConsumer<Integer,Integer> biConsumer= (a,b)-> System.out.println("Addition is "+(a+b));
        biConsumer.accept(10,15);

        List<List<Integer >> listoflists= Arrays.asList(Arrays.asList(1,2,3,4),Arrays.asList(5,6,7,8));
        List<Integer> ls=listoflists.stream().flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println(ls);
 int[] num={1,2,3,4};
 int result= Arrays.stream(num).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(-1);
        System.out.println(result);
        String str="my name is lovely";
        Map<String,Long> occurence= Arrays.stream(str.split("\\s+")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(occurence);

        String word="programming";
        Map<Character,Long> letterCount= word.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        letterCount.forEach((letter,count)-> System.out.println(letter+" : "+count));



    }


    }

