package JavaConcepts.Streams;

public class firstNonRepeatedCharacters {

    public static void main(String[] args) {
        String input = "Swiss";
        Character result = input.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> input.indexOf(c) == input.lastIndexOf(c))
                .findFirst().orElse(null);
        System.out.println(result);
    }
}
