package JavaConcepts;

public class StringReverse {
    public static void main(String[] args) {
        String InputString="RahulShettyAcademy";
        String OutputString="";


        for(int i=InputString.length()-1;i>=0;i--)
        {
            OutputString=OutputString+InputString.charAt(i);
        }
        System.out.println(OutputString);

    }
}
