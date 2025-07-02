package JavaConcepts.Streams;

public class LongestCommonprefixSimplest {

        public static void main(String[] args) {
            String[] strs = {"flower", "flow", "flight"};
            System.out.println("Longest Common Prefix: " + longestCommonPrefix(strs));
        }

        public static String longestCommonPrefix(String[] strs) {
            if (strs == null || strs.length == 0) return "";

            String prefix = strs[0]; // Start with the first word
            for (int i = 1; i < strs.length; i++) {
                // While the current word doesn't start with the current prefix
                while (!strs[i].startsWith(prefix)) {
                    // Shorten the prefix
                    prefix = prefix.substring(0, prefix.length() - 1);
                    if (prefix.isEmpty()) return ""; // No common prefix found
                }
            }
            return prefix;
        }
    }


