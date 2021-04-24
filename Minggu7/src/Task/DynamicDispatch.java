package Task;

/**
 *
 * @author Fauzan
 */
class A {
    void calthis() {
        System.out.println("Inside Class A's Method!");
    }
}
class B extends A {
    void calthis() {
        System.out.println("Inside Class B's Method!");
    }
}
class C extends A {
    void calthis() {
        System.out.println("Inside Class C's Method!");
    }
}
public class DynamicDispatch {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        A ref;
        
        ref = b;
        ref.calthis();
        
        ref = c;
        ref.calthis();
        
        ref = a;
        ref.calthis();
    }
}
