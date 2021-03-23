package Task;

import java.util.Scanner;

/**
 *
 * @author Fauzan
 */
public class membuat_sintaks {
    public static void main(String[] args) {
        System.out.println("--------------------------------------------");
        System.out.println("         Kharisma Agung Plaza (KAP)         ");
        System.out.println("          Promo Belanja Berhadiah           ");
        System.out.println("     Khusus Pembelian 5 Barang Pertama      ");
        System.out.println("      Dengan harga minimum Rp 10000,00      ");
        System.out.println("--------------------------------------------");
        
        Scanner input = new Scanner(System.in);
        String nama;
        int harga, total = 0;
        
        System.out.print("Masukkan nama pembeli : ");
        nama = input.nextLine();
        System.out.println("");
        
        // menginput harga serta menjumlahkan langsung harganya
        for (int i = 1; i <= 5; i++) {
            System.out.print("Masukkan harga barang ke-" +i +"    : ");
            harga = input.nextInt();
            total += harga;
        }
        System.out.println("Total harga pembelian atas nama " +nama +" adalah Rp " +total);
        System.out.println("");
        
        // membuat output jika total harga yang dihasilkan mencapai 10rb atau lebih
        if(total >= 10000) {
            System.out.println("Selamat....");
            System.out.println("Anda mendapat hadiah 1 buah mug cantik");
        } else {
        }
        System.out.println("--------------------------------------------");
        System.out.println("                Terima Kasih                ");
        System.out.println(" Anda sudah belanja di Kharisma Agung Plaza ");
    }
}
