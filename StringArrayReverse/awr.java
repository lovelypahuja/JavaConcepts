package JavaConcepts.StringArrayReverse;

public class awr {
    public static void main(String[] args) {
        String[] arr= {"hello","world"};
        String[] result= new String[arr.length];

        for(int i=arr.length-1;i>=0;i--){
            result[arr.length-1-i]=reverseString1(arr[i]);

    }
        for(String str:result){
            System.out.println(str);
        }

}
public static String reverseString1(String str){
        char[] ch=str.toCharArray();
        String reversed="";
        for(int i=ch.length-1;i>=0;i--){
            reversed+=ch[i];
        }
        return reversed;
}


}
