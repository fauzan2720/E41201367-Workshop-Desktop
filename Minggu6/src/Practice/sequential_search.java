package Practice;

/**
 *
 * @author Fauzan
 */
public class sequential_search {
    public static void main(String[] args) {
        int[] exampleVariableOne = {2, 9, 6, 7, 4, 5, 3, 0, 1};
        int target = 4;
        SequentialSearch(exampleVariableOne, target);
    }

    private static void SequentialSearch(int[] parameterOne, int parameterTwo) {
        int index = -1;
        // mencari setiap indeks dari array hingga mencapai indeks terakhir
        for (int i = 0; i < parameterOne.length; i++) {
            if(parameterOne[i] == parameterTwo) {
                // jika target ditemukan, maka int index ditetapkan sebagai nilai i, dan
                // perulangan for diakhiri
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Your target integer does not exist in the array");
        } else {
            System.out.println("Your target integer is in index " +index +" of the array");
        }
    }
}
