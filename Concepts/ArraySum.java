package JavaConcepts.Concepts;

public class ArraySum {
    public static int[] sumArrays(int[] arr1,int[] arr2){
        int maxlength= Math.max(arr1.length,arr2.length);
        int[] sumarray=new int[maxlength];

        for(int i=0;i<maxlength;i++){
            int val1= (i<arr1.length)?arr1[i]:0;
            int val2= (i<arr2.length)?arr2[i]:0;
            sumarray[i]= val1+val2;
        }
        return sumarray;

    }

    public static void main(String[] args) {
        int[] a={1,2,3,4};
        int[] b={1,2,3};
        int[] result= sumArrays(a,b);
        System.out.println("Sum Array is ");
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+ " ");
        }

    }
}
