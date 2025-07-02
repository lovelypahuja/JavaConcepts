package JavaConcepts.JavaConcepts;

public class tiger extends animal{
    public void sound(){
        System.out.println("sound");
    }

    @Override
    public void eat() {
        System.out.println("eat new");
    }

    public static void main(String[] args) {
        animal a= new tiger();
        a.eat();
        tiger t= new tiger();

    }
}
