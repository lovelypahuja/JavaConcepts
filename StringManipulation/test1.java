package JavaConcepts.StringManipulation;

public class test1 {
    public static void main(String[] args) {
        String str="Welcome to school";
        String reversed= " ";
        for(int i=str.length()-1;i>=0;i--){
            reversed=reversed+str.charAt(i);

        }
        System.out.println(reversed);
    }
}
