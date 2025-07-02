package JavaConcepts.Streams;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class wc {
    public static void main(String[] args) {
        String str = "my name is lovely and lovely is my name";

                Map < String, Long> wordCount = Arrays.stream(str.split("\\s+")).collect(Collectors.
                        groupingBy(Function.identity(),Collectors.counting()));
       wordCount.forEach((word,count)-> System.out.println(word+":"+count));
        }


    }