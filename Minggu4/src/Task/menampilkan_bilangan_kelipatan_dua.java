package Task;

/**
 *
 * @author Fauzan
 */
public class menampilkan_bilangan_kelipatan_dua {
    public static void main(String[] args) {
        System.out.println("         Do_While           ");
        System.out.println("Bilangan kelipatan 2 (1-100)");
        System.out.println("============================");
        
        int i = 1;
        do {
            System.out.print(" " +i +" ");
            i = i * 2; // setiap nilai i nya dikalikan 2
        } while(i <= 100); // batas perulangan jika i bernilai 100 kebawah
        System.out.println("");
    }
}
