package Practice;

/**
 *
 * @author Fauzan
 */
public class statement_for_each {
    public static void main(String[] args) {
        // membuat array
        int angka[] = {3, 1, 42, 24, 12};
        
        // menggunakan perulangan for each untuk menampilkan angka
        for(int x : angka) {
            System.out.print(+x +" "); // mencetak array
        }
    }
}
