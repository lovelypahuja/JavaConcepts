package JavaConcepts.StringManipulation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.reverse;

public class wordReverseCollection {
    public static void main(String[] args) {


        String str = "welcome to java world";
        List<String> wordlist = Arrays.asList(str.split(" "));
        Collections.reverse(wordlist);
        System.out.println(String.join(" ", wordlist));

    }
}
