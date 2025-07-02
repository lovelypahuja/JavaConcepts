package JavaConcepts.Streams;


    import java.util.Arrays;
import java.util.List;

    public class LongestCommonPrefixSimple {

        public static void main(String[] args) {
            List<String> words = Arrays.asList("flower", "flow", "flight");

            String prefix = longestCommonPrefix(words);
            System.out.println("Longest Common Prefix: " + prefix);
        }

        public static String longestCommonPrefix(List<String> words) {
            if (words == null || words.isEmpty()) return "";

            String first = words.get(0);

            for (int i = 0; i < first.length(); i++) {
                final int index = i; // Make a final copy of i
                final char currentChar = first.charAt(i); // Make a final copy of c

                boolean allMatch = words.stream()
                        .skip(1)
                        .allMatch(word -> index < word.length() && word.charAt(index) == currentChar);

                if (!allMatch) {
                    return first.substring(0, index);
                }
            }

            return first;
        }
    }



