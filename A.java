/* Java Variables */

public class A {
    int a = 10; // Instance Variable
    static int b = 20;  // static variable
    public static void main(String[] args) {
        int c = 30; // Local Variable
        final int D = 40;   // final variable

        A a1=new A();   // object creation

        System.out.println(a1.a);
        System.out.println(b);

        System.out.println(c);
        System.out.println(D);
    }
}