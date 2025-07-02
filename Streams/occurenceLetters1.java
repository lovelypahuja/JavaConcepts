package JavaConcepts.Streams;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class occurenceLetters1 {

    public static void main(String[] args) {
        String str="Lovely";
        Map<Character,Long> LetterCount=str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        LetterCount.forEach((Letter,Count)-> System.out.println(Letter+" : "+Count));

    }


    }

