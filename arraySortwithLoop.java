package JavaConcepts;

public class arraySortwithLoop{




    public static void main(String[] args) {
        int[] array1= {8,6,3,0,1,7,5,1,5};


        for(int i=0;i<array1.length;i++){
            for(int j=0;j< array1.length-i-1;j++){
                if(array1[j]>array1[j+1]){
                    int temp=array1[j];
                    array1[j]=array1[j+1];
                    array1[j+1]=temp;
                }
            }






        }
        System.out.println("sorted array");
        for(int n: array1){
            System.out.print(n+" ");
        }


    }


}

