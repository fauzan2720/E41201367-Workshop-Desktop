package Practice;

/**
 *
 * @author Fauzan
 */
public class menghitung_jumlah_elemen_array {
    public static void main(String[] args) {
        // Mendeklarasikan array tanpa menyebutkan jumlah elemen yang diperlukan
        int[] angka;
        angka = new int[3]; // harus menulis angka berdasarkan banyak data yang diperlukan
        System.out.println("Jumlah array tersebut adalah : " +angka.length);
        
        // Mendeklarasikan array dengan menyebutkan jumlah elemen yang diperlukan
        String[] text = new String[4];
        System.out.println("Jumlah array tersebut adalah : " +text.length);
        
        // Mendeklarasikan variabel array secara otomatis
        int[] nilai = {90,89,88,98,85};
        System.out.println("Jumlah array tersebut adalah : " +nilai.length);
    }
}
