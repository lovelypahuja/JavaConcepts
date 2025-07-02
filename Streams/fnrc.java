package JavaConcepts.Streams;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class fnrc {
    public static void main(String[] args) {
        String str="swissaabbbccc";
       Optional<Character> result= str.chars().mapToObj(c->(char)c).filter(c->str.indexOf(c)==str.lastIndexOf(c)).findFirst();
        System.out.println(result.orElse(null));

        //occurrence of each letter
       List<Character> letterCount=  str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet()
                .stream().filter(e->e.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(letterCount);

        //uppercase and lowercase count
        String str1="sWisSaaBBbccc";
        char[] s= str1.toCharArray();
        int uppercase=0;
        int lowercase=0;
        for(char c:s) {
            if (Character.isUpperCase(c))
                uppercase++;
            else lowercase++;
        }
        System.out.println("Uppercase letter's count "+uppercase);
        System.out.println("Lowercase letter's count "+lowercase);

        }


    }

