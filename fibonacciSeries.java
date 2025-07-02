package JavaConcepts;

import java.util.Scanner;

public class fibonacciSeries {
    public static void main(String[] args) {
  Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int fibLength= sc.nextInt();

        int[] num= new int[fibLength];
        num[0]=0;
        num[1]=1;
        for(int i=2;i<=fibLength-1;i++)
        num[i]=num[i-1]+num[i-2];

        for(int i=0;i<=fibLength-1;i++){
            System.out.println(num[i]+" ");
        }
    



    }
}
