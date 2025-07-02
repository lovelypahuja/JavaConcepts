package JavaConcepts;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostFrequentWithTies {

    public static void main(String[] args) {
        int[] a1 = {1, 2, 3, 4};
        int[] a2 = {2, 3, 4, 5, 6, 7};
        int[] a3={1,2,2,2,2,2,3,3,3,3,4,4,54,5,6,6,6,3};
        String str="My name is LovelyPahuja";
        String str1="my name is lovely and lovelY is  name";
        String[] str2={"flower","flow","flowing"};

        Set<Integer> s=new HashSet<>();
        for(int i:a1)
        s.add(i);

        Set<Integer> matched= new TreeSet<>();
        Set<Integer> unmatched= new TreeSet<>();

            for(int j:a2){
                if(s.contains(j))
                    matched.add(j);
                else unmatched.add(j);
            }
        System.out.println(matched);
        System.out.println(unmatched);
        Map<Integer,Long> occurrenceIntCount=Arrays.stream(a3).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(occurrenceIntCount);
        List<Integer> FrequentIntegers=occurrenceIntCount.entrySet().stream().filter(e->e.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(FrequentIntegers);
        //Optional<Integer> mp= occurrenceIntCount.entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey);
        Optional<Map.Entry<Integer, Long>> maxEntry = occurrenceIntCount.entrySet().stream()
                .max(Map.Entry.comparingByValue());

        if (maxEntry.isPresent()) {
            int mostFrequent = maxEntry.get().getKey();
            long maxValue = maxEntry.get().getValue();
            System.out.println("Most Frequent Integer: " + mostFrequent);
            System.out.println("Max Frequency: " + maxValue);

            // All integers with same max frequency (in case of ties)
            List<Integer> tiedMax = occurrenceIntCount.entrySet().stream()
                    .filter(e -> e.getValue().equals(maxValue))
                    .map(Map.Entry::getKey)
                    .collect(Collectors.toList());
            System.out.println("Most Frequent Integers (with ties): " + tiedMax);
        } else {
            System.out.println("No values found.");
        }
    }
    }





