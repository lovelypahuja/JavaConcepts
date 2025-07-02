package JavaConcepts.Streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

//package org.example;
//
//import java.util.List;
//
//public class flatMap {
//
//}
// class items{
//     private String name;
//
//    public String getName(){
//        return name;}
//     private int id;
//
//     public int id(){
//         return id;}
//
//}
//
//class orders{
//    private List<items> itemss;
//    public List<items> itemss(){
//        return itemss;
//    }
//
//    List<List<Ord>> result= List<List<iems>>
//
//}
public class flatMap{
    static List<List<Integer>> ListofLists= Arrays.asList(Arrays.asList(1,2,3,4),Arrays.asList(6,7,7,8));
    public static List<Integer> result= ListofLists.stream().flatMap(Collection::stream).collect(Collectors.toList());

    public static void main(String[] args) {
        System.out.println(result);
    }

}
//import java.util.*;
//        import java.util.function.Function;
//        import java.util.stream.Collectors;
//
//public class WordOccurrences {
//    public static void main(String[] args) {
//        String sentence = "java is great and java is powerful";
//
//        Map<String, Long> wordCount = Arrays.stream(sentence.split("\\s+")) // Split sentence into words
//                .collect(Collectors.groupingBy(
//                        Function.identity(), // Group by the word itself
//                        Collectors.counting() // Count occurrences of each word
//                ));
//
//        // Printing the word occurrences
//        wordCount.forEach((word, count) ->
//                System.out.println(word + " : " + count));
//    }
//}
//import java.util.*;
//        import java.util.function.Function;
//        import java.util.stream.Collectors;
//
//public class CharacterOccurrences {
//    public static void main(String[] args) {
//        String input = "programming";
//
//        Map<Character, Long> characterCount = input.chars() // IntStream of characters
//                .mapToObj(c -> (char) c) // Convert int to Character
//                .collect(Collectors.groupingBy(
//                        Function.identity(), // Group by the character itself
//                        Collectors.counting() // Count how many times each character appears
//                ));
//
//        // Printing the character occurrences
//        characterCount.forEach((character, count) ->
//                System.out.println(character + " : " + count));
//    }
//}


