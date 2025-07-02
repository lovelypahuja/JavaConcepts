package JavaConcepts.Streams;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class test {




    public static void main(String[] args) {
        //Find the occurrence of each character in a "My Name Is Lovely Pahuja"
        //o/p: M-2,Y-1,N-2,A-4 etc.
        String str= "My Name Is Lovely Pahuja";
        String strwithoutspace=str.replace(" ","");
        Map<Character,Long> mp= strwithoutspace.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(mp);


        }


    }




