package Practice;

import java.util.Scanner; // memanggil Scanner

public class inputData_Scanner {
    public static void main(String[] args) {
        // buat scanner
        Scanner sl = new Scanner(System.in);

        // ambil dari keyboard
        System.out.print("Masukkan nilai 1 = ");
        int nilai1 = sl.nextInt();
        System.out.print("Masukkan nilai 2 = ");
        int nilai2 = sl.nextInt();

        // hitung dan print
        int jumlah = nilai1 + nilai2;
        System.out.println("Jumlah = " + jumlah);
    }
}
