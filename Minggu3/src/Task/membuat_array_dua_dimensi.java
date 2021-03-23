package Task;

/**
 *
 * @author Fauzan
 */
public class membuat_array_dua_dimensi {
    public static void main(String[] args) {
        int angka[][] = {{5, 6, 1, 7},
                {8, 1, 2, 9},
                {5, 4, 7, 1},
                {5, 4, 7, 1},
                {8, 3, 7, 5}
        };
        for (int baris = 0; baris < 5; baris++) {
            for (int kolom = 0; kolom < 4; kolom++) {
                System.out.print(angka[baris][kolom] +" ");
            }
            System.out.println("");
        }
    }
}
