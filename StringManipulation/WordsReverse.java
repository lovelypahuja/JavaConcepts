package JavaConcepts.StringManipulation;

public class WordsReverse {
    public static void main(String[] args) {
        String str = "Welcome to java world";
        String words[] = str.split(" ");
        StringBuilder reversed = new StringBuilder();
        System.out.println(words.length);
        System.out.println(str.length());

        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) {
                reversed.append(" ");
            }
        }

        System.out.println(reversed);
        System.out.println(reversed.toString());

    }
}