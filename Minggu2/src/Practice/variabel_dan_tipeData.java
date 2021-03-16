package Practice;

/**
 *
 * @author Fauzan
 */
public class variabel_dan_tipeData {
    public static void main(String[] args) {
        String nama = "Fauzan Abdillah"; // String menampilkan text, jadi bukanlah tipe data. penggunaannya harus diawali dan diakhiri dengan tanda petik 2 ("...")
        char jenisKelamin = 'L'; // tipe data char berarti menampilkan single karakter (unicode). harus diawali dan diakhiri dengan tanda petik 1 ('...'). memiliki alokasi memori sebesar 2 bytes
        int umur = 19; // menampilkan bilangan bulat. perbedaan dengan long dan byte yaitu pada alokasi memori. int = 4 bytes, long = 8 bytes, dan byte = 1 byte
        double ipk = 3.60; // menampilkan bilangan real. perbedaan dengan float pada alokasi memori. double 8 bytes, dan float = 4 bytes
        boolean status = true; // menampilkan true or false. memiliki alokasi memori sebesar 1 byte
        
        System.out.println("Nama                = " +nama);
        System.out.println("Jenis Kelamin       = " +jenisKelamin);
        System.out.println("Umur                = " +umur +" tahun");
        System.out.println("IPK                 = " +ipk);
        System.out.println("Mahasiswa Polije?   = " +status);
    }
}
