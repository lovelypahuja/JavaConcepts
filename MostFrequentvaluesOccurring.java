package JavaConcepts;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostFrequentvaluesOccurring {

    public static void main(String[] args) {
        int[] a1 = {1, 2, 3, 4};
        int[] a2 = {2, 3, 4, 5, 6, 7};
        int[] a3={1,2,2,2,2,2,3,3,3,3,4,4,54,5,6,6,6,3};
        String str="My name is LovelyPahuja";
        String str1="my name is lovely and lovelY is  name";
        String[] str2={"flower","flow","flowing"};
        Map<Integer,Long> integerCount= Arrays.stream(a3).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        integerCount.forEach((integer,count)-> System.out.println(integer+":"+count));
        List<Integer> keysWithOccurrences=integerCount.entrySet().stream().filter(e->e.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toList());
        Optional<Map.Entry<Integer, Long>> keyWithMaxOccurrences=integerCount.entrySet().stream().max(Map.Entry.comparingByValue());
        if(keyWithMaxOccurrences.isPresent()){
            int mostFrequentKey=keyWithMaxOccurrences.get().getKey();
            Long mostFrequentValue=keyWithMaxOccurrences.get().getValue();
            System.out.println(mostFrequentKey+"---");
            System.out.println(mostFrequentValue+"---___");
            List<Map.Entry<Integer, Long>> mostFreqvalues=integerCount.entrySet().stream().filter(e->e.getValue().equals(mostFrequentValue)).collect(Collectors.toList());
            System.out.println(mostFreqvalues+"...---");
        }
        System.out.println(keyWithMaxOccurrences);



    }
    }





