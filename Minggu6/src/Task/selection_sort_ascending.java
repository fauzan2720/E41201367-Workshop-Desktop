package Task;

/**
 *
 * @author Fauzan
 */
public class selection_sort_ascending {
    
    /*
    Algoritma :
    1. Mencari nilai terkecil
    2. Tukar langsung nilai terkecil nya dengan data index ke-i
    3. Melakukan pencarian lagi dan bermulai dari index ke i+1
    4. Mengulang proses 1 sampai 3
    5. Selesai
    */
    
    static void selectionSort(int[] arr) {
        int n = arr.length, perbandingan = 0, swap = 0;
        
        for (int i = 0; i < n-1; i++) {
            System.out.println("Menentukan data ke-" +(i+1) +" :");
            int index = i, nMin  = arr[i];
                    
            // mencari nilai terkecil
            for (int j = i+1; j < n; j++) {
                if (arr[j] < nMin) {
                    nMin = arr[j];
                    index = j;
                }
            } // akhir pencaian
            
            System.out.println("Diketahui nilai terkecilnya = " +nMin);

            // proses swap
            perbandingan++;
            if (arr[index] == arr[i]) {
                System.out.println("Apakah " +arr[index] +" = " +arr[i] +"? iya, tidak terjadi pertukaran");
            } else {
                System.out.println("Apakah " +arr[index] +" = " +arr[i] +"? tidak, maka tukar");
                arr[index] = arr[i];
                arr[i] = nMin;
                swap++;
            }
            
            // memanggil nilai array sementara
            System.out.print("Nilai array sementaranya = ");
            for (int k = 0; k < n; k++) {
                System.out.print(arr[k] +" ");
            }
        
            System.out.println("\n");
        }
        
        System.out.println("Terjadi " +perbandingan +"x perbandingan dan "
                            +swap +"x pertukaran\n");
    }
    
    public static void main(String[] args) {
        int arr[] = {5, 4, 6, 7, 3};
        
        System.out.println("Nilai array sebelum disorting :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
        System.out.println("");
        System.out.println("");
        
        selectionSort(arr); // memanggil proses selection sort
        
        System.out.println("Nilai array setelah disorting :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
        System.out.println("");
    }
}
