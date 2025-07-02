package JavaConcepts.Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class limitStream {
    public static List<String> namelist= Arrays.asList("John","jack","lovely","Harry","pom","Sandy");
    public static List<Integer> numbers= Arrays.asList(1,2,3,4,5,6);
    public static List<Integer> resultNumbers=numbers.stream().sorted(Comparator.reverseOrder()).skip(2).limit(1).collect(Collectors.toList());
    public static List<String> result= namelist.stream().limit(3).collect(Collectors.toList());
    public static List<String> result1= namelist.stream().skip(3).collect(Collectors.toList());
    public static Optional<Integer> redudceNumbers= numbers.stream().reduce((a, b)->a*b);
    public static Optional<Integer> MaxNumber= numbers.stream().max(Integer::compareTo);
    public static Optional<Integer> MaxNumber3= numbers.stream().sorted(Comparator.reverseOrder()).skip(2).max(Integer::compareTo);
    public static Optional<Integer> MaxNumber4= numbers.stream().sorted(Comparator.reverseOrder()).skip(2).findFirst();//most easy
    static int maxnumber2=MaxNumber4.get();
    static int[] array= {1,2,2,3,4,5,6,7,7,8,9};


    static int result2= Arrays.stream(array).boxed().sorted(Comparator.reverseOrder()).skip(2).findFirst().orElse(-1);


    public static void main(String[] args) {
        System.out.println(result);
        System.out.println(result1);
        System.out.println(resultNumbers);
        namelist.stream().forEach(word-> System.out.println(word));
        System.out.println(redudceNumbers);
        System.out.println(MaxNumber);
        System.out.println(MaxNumber3);
        System.out.println(MaxNumber4);
        System.out.println(result2);
        System.out.println(maxnumber2);
    }

}
