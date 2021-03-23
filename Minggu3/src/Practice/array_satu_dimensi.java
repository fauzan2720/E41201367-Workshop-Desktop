package Practice;

/**
 *
 * @author Fauzan
 */
public class array_satu_dimensi {
    public static void main(String[] args) {
        int nilai_wsibd[] = {90, 92, 95, 91, 99, 93};
        String text[] = {"Semoga ", "terwujud, ", "Amiinnn"};
        
        // memanggil isi array nilai_wsibd
        for(int i = 0; i < nilai_wsibd.length; i++) {
            System.out.println("Nilai mata kuliah WSIBD ke-" +i +" anda adalah " +nilai_wsibd[i]);
        }
        System.out.println("");
        
        // memanggil isi array text
        for(int j = 0; j < text.length; j++) {
            System.out.print(text[j]);
        }
        System.out.println("");
    }
}
