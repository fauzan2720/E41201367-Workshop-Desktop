package Practice.Konstruktor3;

/**
 *
 * @author Fauzan
 */
public class A {
    A() { } // konstruktor default, diperlukan hanya agar program dapat
            // dikompilasi.

    A(String param1) {
        System.out.println("Konstruktor class A dengan Parameter " 
                +param1 +" dieksekusi ...");
    }
}
