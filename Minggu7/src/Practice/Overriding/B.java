package Practice.Overriding;

/**
 *
 * @author Fauzan
 */
public class B extends A {
    public void tampilkan_ke_layar() {
        super.tampilkan_ke_layar(); // memanggil method milik dari superclassnya
        System.out.println("Method milik class B dipanggil");
    }
}
