package JavaConcepts.Concepts;

import java.util.Scanner;

public class fs1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("please enter the number");
        int fiblength=sc.nextInt();
        int num[]= new int[fiblength];
        num[0]=1;
        num[1]=2;
        for(int i=2;i<=fiblength-1;i++){
            num[i]=num[i-1]+num[i-2];
        }

        for(int i=0;i<=fiblength-1;i++){
            System.out.println(num[i]);
        }

    }
}
