package Task;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Fauzan
 */
public class membuat_deretan_array {
    public static void main(String[] args) {
        Scanner input_nilai = new Scanner(System.in);
        Random angka = new Random(); // membuat angka random
        
        int banyak_data;
        
        System.out.print("Masukkan jumlah data : ");
        banyak_data = input_nilai.nextInt();
        
        int array[] = new int[banyak_data];
        
        // memanggil isi array berdasarkan banyak index yang diinputkan
        for (int i = 0; i < array.length; i++) {
            int nilai_random = angka.nextInt(10); // 10 berarti angka random positif <10
            array[i] = nilai_random;
            System.out.print(array[i] +" ");
        }
        System.out.println("");
    }
}
