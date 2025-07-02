package JavaConcepts.Streams;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RepeatedWordsInString {

    public static void main(String[] args) {
   String str="welcome to java and java to welcome";
        Map<String,Long> WordCount= Arrays.stream(str.split("\\s+")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        WordCount.forEach((word,count)-> System.out.println(word+" "+count));
       List<String> result= WordCount.entrySet().stream().filter(e->e.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(result);
    }
    }





