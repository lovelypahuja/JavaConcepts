package JavaConcepts;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccurrenceOfLettersinWord {
    public static void main(String[] args) {
//String str="my name is lovely";
//        Map<String,Long> wordCount= Arrays.stream(str.split("\\s+")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//        System.out.println(wordCount);

        String word = "programming";

        Map<Character, Long> frequencyMap = word.chars()
                .mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        frequencyMap.forEach((letter, count) ->
                System.out.println(letter + " : " + count));

    }
}
//package org.Streams;
//
//import java.util.Arrays;
//import java.util.Map;
//import java.util.function.Function;
//import java.util.stream.Collectors;
//
//import static org.Streams.filterStream.count;
//
//public class occurrenceOfEachWord {
//    public static void main(String[] args) {
//        String sentence= "Java is powerful and java is great";
//        Map<String,Long> WordCount= Arrays.stream(sentence.split("\\s+")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//        //System.out.println(WordCount);
//       //WordCount.forEach(word,count)->
//        //System.out.println(word + " : " + count));
//        WordCount.forEach((word, count) ->
//                System.out.println(word + " : " + count));
//    }
//        }