package Task;

import java.util.Scanner;

/**
 *
 * @author Fauzan
 */
public class menentukan_bilangan_genap {
    public static void main(String[] args) {
        // membuat scanner
        Scanner input = new Scanner(System.in);
        int batas_awal, batas_akhir; // membuat variabel
        
        System.out.print("Masukkan batas awal: ");
        batas_awal = input.nextInt();
        
        System.out.print("Masukkan batas akhir: ");
        batas_akhir = input.nextInt();
        
        for (int i = batas_awal; i <= batas_akhir; i++) {
            if(i%2 == 0) { // jika i modulo 2 2bersisa 0 maka
                System.out.print(i +" "); // mencetak nilai i
            }
        }
        System.out.println("");
    }
}
