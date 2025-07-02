package JavaConcepts.Streams;

import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.stream.Collectors;

public class mapStream {
    public static List<String> fruits= Arrays.asList("Apple","Banana","Cherry","Cherry","Apple");
    public static String array[] ={"Apple","Banana","Cherry","Cherry","Apple"};
    static List<String> reverseSorted1= Arrays.stream(array).sorted(Comparator.reverseOrder()).collect(Collectors.toList());

    static List<String> peekResult= fruits.stream().peek(word-> System.out.println(word)).map(String::toUpperCase).collect(Collectors.toList());
    static List<String> sorted= fruits.stream().sorted().collect(Collectors.toList());
    static List<String> reverseSorted= fruits.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

    static List<String> naturalSorted= fruits.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
   static List<String> uppercase= fruits.stream().map(String::toUpperCase).collect(Collectors.toList());
    static Set<String> distincts= fruits.stream().map(String::toUpperCase).collect(Collectors.toSet());
    static List<String> distincts2= fruits.stream().map(String::toUpperCase).distinct().collect(Collectors.toList());
    static List<String> Startb= fruits.stream().filter(word->word.startsWith("C")).collect(Collectors.toList());
    static Optional StartbFirst= fruits.stream().filter(word->word.startsWith("C")).findFirst();
    static Optional StarthFirst= fruits.stream().filter(word->word.startsWith("h")).findFirst();
    static List<Integer> lengths= fruits.stream().collect(Collectors.mapping(String::length, Collectors.toList()));
    //static List<IntStream> lengths1= fruits.stream().collect(Collectors.mapping(String::chars, Collectors.toConcurrentMap()
    static Map<Integer,Long> groupresult= fruits.stream().collect(Collectors.groupingBy(String:: length, Collectors.counting()));





    public static void main(String[] args) {
        int size= fruits.stream().collect(Collectors.collectingAndThen(Collectors.toSet(), Set::size));
        System.out.println(size);
        System.out.println(reverseSorted1);
        System.out.println(uppercase);
        System.out.println(distincts);
        System.out.println(distincts2);
        System.out.println(sorted);
        System.out.println(naturalSorted);
        System.out.println(reverseSorted);
        System.out.println("--------------------");
        System.out.println(peekResult);
        System.out.println(Startb);
        System.out.println(StartbFirst);
        System.out.println(StarthFirst);
        System.out.println(lengths);
        System.out.println(groupresult);
       // System.out.println(lengths1);

        //result is Apple
        //Banana
        //Cherry
        //Cherry
        //Apple
        //[APPLE, BANANA, CHERRY, CHERRY, APPLE]
        //[CHERRY, APPLE, BANANA]
        //[APPLE, BANANA, CHERRY]
        //[Apple, Apple, Banana, Cherry, Cherry]
        //[Apple, Apple, Banana, Cherry, Cherry]
        //[Cherry, Cherry, Banana, Apple, Apple]
        //--------------------
        //[APPLE, BANANA, CHERRY, CHERRY, APPLE]
        //[Cherry, Cherry]
        //Optional[Cherry]
        //Optional.empty

        //<if it is string array>
        //    public static void main(String[] args) {
        //        String[] s = {"apple", "banana"};
        //
        //        Optional<String> result = Arrays.stream(s).findFirst();
        //
        //        System.out.println(result);       // Output: Optional[apple]
        //        System.out.println(result.get()); // Output: apple
        //    }
        //}


    }
}
