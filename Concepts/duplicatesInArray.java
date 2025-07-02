package JavaConcepts.Concepts;

public class duplicatesInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 3, 4, 5, 6, 6, 7};
        System.out.println("Duplicates: ");
        boolean found = false;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                if (i == 1 | arr[i] != arr[i - 2])
                    System.out.println(arr[i] + " ");
                found = true;
            }
            if (!found) System.out.println("No duplicates found");

        }


    }
}
