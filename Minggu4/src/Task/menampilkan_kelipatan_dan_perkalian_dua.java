package Task;

/**
 *
 * @author Fauzan
 */
public class menampilkan_kelipatan_dan_perkalian_dua {
    public static void main(String[] args) {
        // menampilkan bilangan kelipatan 2
        System.out.println("         For_Loop           ");
        System.out.println("Bilangan kelipatan 2 (0-100)");
        System.out.println("============================");
        
        for (int i = 0; i <= 100;) { // batas perulangan jika i bernilai 100 kebawah
            System.out.print(" " +i +" ");
            i = i + 2; // setiap nilai i nya ditambah 2
            if(i%7 == 0) { // membuat baris berikutnya jika i modulo 7 bersisa 0
                System.out.println("");
            }
        }
        System.out.println("");
        System.out.println(""); // end
        
        // menampilkan bilangan perkalian 2
        System.out.println("         Do_While           ");
        System.out.println("Bilangan perkalian 2 (0-100)");
        System.out.println("============================");
        
        int j = 2;
        do {
            System.out.print(" " +j +" ");
            j = j * 2; // setiap nilai j nya dikalikan 2
        } while(j <= 100); // batas perulangan jika j bernilai 100 kebawah
        System.out.println(""); // end
    }
}
