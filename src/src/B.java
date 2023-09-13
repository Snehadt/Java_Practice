package src;

public class B extends A{
    public void msg(){
        System.out.println("Hello B");
    }

    public static void main(String[] args) {
        A obj = new B();
        obj.msg();
    }

}
