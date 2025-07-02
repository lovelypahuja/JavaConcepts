package JavaConcepts;

public class class2Static extends class1Static{
    public   void m1(){
        System.out.println("m1 child");
    }
//    public  static void m2(){
//        System.out.println("m2 child");
//    }


    public static void main(String[] args) {

      class2Static s= new class2Static();
      s.m1();
      s.m2();
      s.m2();

    }
}
