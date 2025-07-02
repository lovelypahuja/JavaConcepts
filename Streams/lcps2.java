package JavaConcepts.Streams;

public class lcps2 {
    public static void main(String[] args) {
        String[] str = {"flower", "flow", "flight"};
        String prefix=str[0];
        for(int i=0;i< str.length;i++){
            while(!str[i].startsWith(prefix)){
                prefix=prefix.substring(0,prefix.length()-1);
            }
        }
        System.out.println(prefix);
    }
}
