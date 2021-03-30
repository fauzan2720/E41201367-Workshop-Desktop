package Practice;

/**
 *
 * @author Fauzan
 */
public class statement_for {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= i; j++) { // perulangan j terjadi berdasarkan nilai i pada perulangan i
                System.out.print("*");
            }
            System.out.println(""); // mencetak di baris berikutnya
        }
    }
}
