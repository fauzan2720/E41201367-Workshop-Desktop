package Practice.Dasar_Pewarisan.Example;

/**
 *
 * @author Fauzan
 */
public class Pelajar extends Orang {
    private String nim;
    private String asal_sekolah;
    private double nilai; // range 0-30
    
    
    public Pelajar(String nama, double tinggi, double berat, String nim,
            String sekolah, double nilai) {
        super(nama, tinggi, berat);
        this.nim = nim;
        asal_sekolah = sekolah;
        this.nilai = nilai;
    }
    
    public String toString() {
        return (super.toString() +"\nNIM : " +nim +"\nSekolah : " +asal_sekolah
                +"\nNilai : " +nilai);
    }
}
