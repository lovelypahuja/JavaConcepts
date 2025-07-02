package JavaConcepts.Concepts;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class arrayMAtchedUnmatched {
    public static void main(String[] args) {




    int[] array1={8,3,0,4,2,6};
        int[] array2={7,6,3,8,5,1,4,0,9};

//Wap to print Matched Elements between 2 Arrays and Unmatched elements.. ..
//
//Matched Elements: {0,3,4,6}
//
//UnMatched Elements: {1,5,8,9}}
//
        Set<Integer> set1= new HashSet<>();
        for(int n:array1){
            set1.add(n);
        }

        Set<Integer> matched= new TreeSet<>();
        Set<Integer> unmatched= new TreeSet<>();

        for(int num:array2){
            if(set1.contains(num)){
                matched.add(num);
            }
            else
                unmatched.add(num);
        }
        System.out.println("matched elements: "+matched);
        System.out.println("unmatched: "+unmatched);


    }



}
