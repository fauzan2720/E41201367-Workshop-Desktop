package Task;

import java.util.Scanner;

/**
 *
 * @author Fauzan
 */
public class menentukan_minimum_maksimum_ratarata {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // membuat scanner
        int banyak_data, nilai, min = 100, max = 0, rata_rata = 0;
        
        System.out.print("Masukkan banyaknya data nilai = ");
        banyak_data = input.nextInt();
        
        for (int i = 1; i <= banyak_data; i++) {
            System.out.print("Masukkan data nilai ke-" +i +" = ");
            nilai = input.nextInt();
            if(nilai < min) { // jika nilai minimum
                min = nilai;
            } else if(nilai > max) { // jika nilai maksimum
                max = nilai;
            }
            rata_rata += nilai; // menjumlahkan nilai-nilainya
        }
        
        // mencetak data
        System.out.println("Nilai minimum = " +min);
        System.out.println("Nilai maksimum = " +max);
        System.out.println("Nilai rata-ratanya adalah = " +rata_rata/banyak_data);
    }
}
