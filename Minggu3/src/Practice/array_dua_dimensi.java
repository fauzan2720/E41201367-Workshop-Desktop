package Practice;

/**
 *
 * @author Fauzan
 */
public class array_dua_dimensi {
    public static void main(String[] args) {
        int nilai[][] = {{11, 12, 13, 14},
                {21, 22, 23, 24},
                {31, 32, 33, 34}
        };
        for (int baris = 0; baris < 3; baris++) {
            for (int kolom = 0; kolom < 4; kolom++) {
                System.out.print(nilai[baris][kolom] +" ");
            }
            System.out.println("");
        }
    }
}
