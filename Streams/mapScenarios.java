package JavaConcepts.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class mapScenarios {
    public static void main(String[] args) {
        String[] fruits={"Apple","Banana","Cherry","Cherry","Apple"};
        List<String> sorted= Arrays.stream(fruits).sorted().collect(Collectors.toList());
        List<String> distinct=Arrays.stream(fruits).distinct().collect(Collectors.toList());
        List<String> startswithA= Arrays.stream(fruits).filter(word->word.startsWith("c")).collect(Collectors.toList());

        System.out.println(startswithA);

    }



}
