package JavaConcepts;

import java.util.Scanner;
import java.util.stream.IntStream;

public class cubeOfaNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int num= sc.nextInt();
        int limit=10000;
        IntStream.rangeClosed(-limit,limit).filter(n->n*n*n==num).findFirst().ifPresentOrElse(
                n-> System.out.println(num+" is cube of "+n),
        ()-> System.out.println("not a cube"));


        int result1=IntStream.rangeClosed(-limit,limit).filter(n->n*n*n==num).findFirst().orElse(0);

        if(result1==0)
            System.out.println("number is not a cube");
        else
            System.out.println(result1);
    }


}
