package JavaConcepts.JavaConcepts;

import java.util.ArrayList;
import java.util.Arrays;

public class twoArraysMerge {
    public static void main(String[] args) {
        ArrayList<Integer> a1= new ArrayList<>(Arrays.asList(1,2,3));
        ArrayList<Integer> a2= new ArrayList<>(Arrays.asList(4,5,6));
        a1.addAll(a2);
        System.out.println(a1);
        ArrayList<Integer> a3=a1;
        System.out.println(a3);

    }
}
