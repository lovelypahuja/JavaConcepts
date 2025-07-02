package JavaConcepts.Streams;

import java.util.Arrays;

public class LongestCommonPrefixStream {

    public static String findLongestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";

        // Find the minimum length string (shortest string) using streams
        String shortest = Arrays.stream(strs)
                .min((s1, s2) -> Integer.compare(s1.length(), s2.length()))
                .orElse("");

        // Use stream to check character by character
        int prefixLength = (int) shortest.chars()
                .takeWhile(newChar ->
                        Arrays.stream(strs)
                                .allMatch(s -> s.charAt(shortest.indexOf((char)newChar)) == (char)newChar)
                )
                .count();

        return shortest.substring(0, prefixLength);
    }

    public static void main(String[] args) {
        String[] input = {"flight", "flow", "flower"};

        String result = findLongestCommonPrefix(input);
        System.out.println("Longest Common Prefix: " + result);
    }
}
