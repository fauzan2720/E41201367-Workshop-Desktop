package Task;

import java.util.Scanner;

/**
 *
 * @author Fauzan
 */
public class membuat_sintaks_menggunakan_switch_case {
    public static void main(String[] args) {
        System.out.println("                        CAFE CERIA                        ");
        System.out.println("                       ANEKA MINUMAN                      ");
        System.out.println("----------------------------------------------------------");
        System.out.println("                       SPECIAL MENU :                     ");
        
        // membuat array
        String menu[] = {"Soft drinks", "Mix juice", "Nescafe", "Soda milk", "Tea"};
        
        for (int i = 1; i <= 5; i++) { // memanggil isi array
            System.out.println("  " +i +". " +menu[i-1]);
        }
        System.out.println("----------------------------------------------------------");
        
        Scanner input = new Scanner(System.in);
        String nama;
        int pilihan;
        
        System.out.print("Masukkan nama pembeli : ");
        nama = input.nextLine();
        System.out.println("");
        
        // mengulang jika yang diinputkan user <1, atau >5 (angka yang tidak sesuai pada data)
        for (int i = 0; i > 5 || i < 1;) {
            System.out.print("Silahkan masukkan pilihan anda : ");
            pilihan = input.nextInt();
            i = pilihan;

            switch(pilihan) {
                case 1:
                    System.out.println("Minuman yang anda pesan adalah " +menu[0]);
                    break;
                case 2:
                    System.out.println("Minuman yang anda pesan adalah " +menu[1]);
                    break;
                case 3:
                    System.out.println("Minuman yang anda pesan adalah " +menu[2]);
                    break;
                case 4:
                    System.out.println("Minuman yang anda pesan adalah " +menu[3]);
                    break;
                case 5:
                    System.out.println("Minuman yang anda pesan adalah " +menu[4]);
                    break;
            }
        }
        System.out.println("Pesanan anda segera kami antar");
        System.out.println("Terima Kasih " +nama +" telah berkunjung diCafe Ceria");
    }
}
