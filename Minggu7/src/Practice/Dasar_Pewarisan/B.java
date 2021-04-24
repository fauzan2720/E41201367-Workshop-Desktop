package Practice.Dasar_Pewarisan;

/**
 *
 * @author Fauzan
 */
public class B extends A {  // Mendeklarasikan class B yang 
    int z;                  // diturunkan dari class A
    
    void tampilkanJumlah() { 
        // subclass dapat mengakses member dari superclass
        System.out.println("Nilai Z : " +z);
        System.out.println("Jumlah : " +(x+y+z));
    }
}
