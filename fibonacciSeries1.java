package JavaConcepts;

import java.util.Scanner;

public class fibonacciSeries1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int fiblength= sc.nextInt();
        int[] fib= new int[fiblength];
        fib[0]=0;
        fib[1]=1;

        for(int i=2;i<fiblength;i++){
            fib[i]=fib[i-1]+fib[i-2];

        }
        for(int i=0;i<fiblength;i++)
        System.out.println(fib[i]);

    }
}
