package Practice.Konstruktor2;

/**
 *
 * @author Fauzan
 */
public class C extends B {
    C() { // super() : Tambahan kode secara otomatis oleh Java untuk
          //           memanggil konstruktor dari SuperClassnya

          
        super(); // konstruktor default dari class B
                 // object dipanggil
        System.out.println("Konstruktor class C dieksekusi ...");
    }
}
