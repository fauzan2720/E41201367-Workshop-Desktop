package Practice;

import java.util.Scanner;

/**
 *
 * @author Fauzan
 */
public class conditional_statement_if_else {
    public static void main(String[] args) {
        int nilaiIpk;
        double angkaMutu;
        String kriteria;
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai anda : ");
        nilaiIpk = input.nextInt();
        
        if(nilaiIpk > 80) {
            angkaMutu = 4.00;
            kriteria = "Istimewa";
        } else if(nilaiIpk > 76) {
            angkaMutu = 3.50;
            kriteria = "Sangat baik";
        } else if(nilaiIpk > 71) {
            angkaMutu = 3.00;
            kriteria = "Baik";
        } else if(nilaiIpk > 66) {
            angkaMutu = 2.50;
            kriteria = "Cukup baik";
        } else if(nilaiIpk > 56) {
            angkaMutu = 2.00;
            kriteria = "Cukup";
        } else if(nilaiIpk > 46) {
            angkaMutu = 1.00;
            kriteria = "Kurang";
        } else {
            angkaMutu = 0.00;
            kriteria = "Gagal";
        }
        System.out.println("Kriteria   : " +kriteria);
        System.out.println("Angka Mutu : " +angkaMutu);
    }
}
