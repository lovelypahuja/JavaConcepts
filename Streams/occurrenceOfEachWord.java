package JavaConcepts.Streams;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class occurrenceOfEachWord {
    public static void main(String[] args) {
        String sentence= "Java is powerful and java is great";
        Map<String,Long> WordCount= Arrays.stream(sentence.split("\\s+")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        //System.out.println(WordCount);
       //WordCount.forEach(word,count)->
        //System.out.println(word + " : " + count));
        WordCount.forEach((word, count) ->
                System.out.println(word + " : " + count));
    }
        }


