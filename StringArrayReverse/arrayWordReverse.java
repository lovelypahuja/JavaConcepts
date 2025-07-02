package JavaConcepts.StringArrayReverse;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class arrayWordReverse {


    public static void main(String[] args) {
        String[] str={"hello","world"};
        String[] result= new String[str.length];

        for(int i=0;i<str.length;i++){
            result[str.length-1-i]= reverseString(str[i]);

        }
        for(String s:result)

        System.out.println("\""+s+"\"");
    }
    public static String reverseString(String str){

    char[] ch=str.toCharArray();
        String reversed="";
        for(int i=ch.length-1;i>=0;i--){

            reversed+=ch[i];

        }
        return reversed;
    }
}
//public static String reverseString(String str) {
//        char[] chars = str.toCharArray();
//        String reversed = "";
//        for (int i = chars.length - 1; i >= 0; i--) {
//            reversed += chars[i];
//        }
//        return reversed;
//    }