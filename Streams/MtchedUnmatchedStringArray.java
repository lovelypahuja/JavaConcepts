package JavaConcepts.Streams;

import java.util.*;
import java.util.stream.Collectors;

public class MtchedUnmatchedStringArray {

    public static void main(String[] args) {
        int[] i={1,2,3,4,5,5,6,6,7};
        int[] j={4,5,6,7,8,9};
        List<Integer> ls= Arrays.stream(i).boxed().collect(Collectors.toList());

        Set<Integer> hs1= new HashSet<>(ls);
        Set<Integer> matched= new TreeSet<>();
        Set<Integer> unmatched= new TreeSet<>();



        for(int n: j){
            if(ls.contains(n)){
                matched.add(n);
            }
            else unmatched.add(n);
        }
        System.out.print("matched array: "+matched);
        System.out.println("");
        System.out.print("unmatched array: "+unmatched);

    }


    }






