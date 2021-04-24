package Practice.Konstruktor2;

/**
 *
 * @author Fauzan
 */
public class A {
    A() { // super () : Tambahan kode secara otomatis oleh Java untuk memanggil
          //            konstruktor dari SuperClassnya
        
        super(); // konstruktor defaulr dari class
                 // object dipanggil
        System.out.println("Konstruktor class A dieksekusi ...");
    }
}
