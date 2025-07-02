package JavaConcepts.Streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class longestwordinString {
    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter the String");
//        String str= sc.nextLine();
        String str="My name is LovelyPahuja";
        Optional<String> result= Arrays.stream(str.split("\\s+")).reduce((s1, s2)->s1.length()>s2.length()?s1:s2);
        System.out.println(result.orElse("no words found"));
        int[] a= {1,2,2,3,3,3,4,4,4,4,6,7};
        List<Integer> result1=Arrays.stream(a).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet()
                        .stream().filter(e->e.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(result1);
        Optional<String> result3=Arrays.stream(str.split("\\s+")).reduce((s1,s2)->s1.length()>s2.length()?s1:s2);
        System.out.println(result3.orElse(null));
//print most frequent integer now
        List<Integer> result4=Arrays.stream(a).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream()
                .max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).stream().toList();
        System.out.println(result4);



    }
}
