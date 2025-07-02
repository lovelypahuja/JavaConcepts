package JavaConcepts;

import java.util.stream.IntStream;

public class cn {
    public static void main(String[] args) {
      int num=27;
      int limit=10000;
        int result=IntStream.rangeClosed(-limit,limit).filter(i->i*i*i==num).findFirst().orElse(0);
        if(result==0){
            System.out.println("not a cube");
        }
        else System.out.println(result);

        //duplicates in array

    }
}
