package Practice;

/**
 *
 * @author Fauzan
 */
public class statement_do_while {
    public static void main(String[] args) {
        // membuat variable
        int i = 0;
        
        do{
            // kode yang akan dicetak
            System.out.println("Perulangan ke-" +i);
            i++; // increment i
        } while(i <= 10); // perulangan terjadi jika i <=10
    }
}
