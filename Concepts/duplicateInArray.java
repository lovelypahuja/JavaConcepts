package JavaConcepts.Concepts;

import java.util.Arrays;

public class duplicateInArray {

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
       Arrays.sort(arr);
        System.out.println("Duplicates :");
        boolean found=false;
        for(int i=1;i< arr.length;i++){
            if(arr[i]==arr[i-1]){
    if(i==1|arr[i]!=arr[i-2]){
        System.out.println(arr[i] +"");
        found=true;
    }

            }

        }
        if(!found)System.out.println("no duplicates found");
    }


}
