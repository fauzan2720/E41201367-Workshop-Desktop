package Practice.Konstruktor2;

/**
 *
 * @author Fauzan
 */
public class B extends A {
    B() { // super() : Tambahan kode secara otomatis oleh Java untuk
          //           memanggil konstruktor dari SuperClassnya

          
        super(); // konstruktor default dari class A
                 // object dipanggil
        System.out.println("Konstruktor class B dieksekusi ...");
    }
}
