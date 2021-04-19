package Practice;

/**
 *
 * @author Fauzan
 */
public class bubble_sort_ascending {
    static void bubbleSort(int[] arr) {
        int n = arr.length, temp  = 0, perbandingan = 0, swap = 0;
        
        for (int i = 0; i < n-1; i++) {
            System.out.println("Menentukan data ke-" +(i+1) +" :");
            
            for (int j = 1; j < (n-i); j++) {
                perbandingan++;
                if(arr[j-1] > arr[j]) {
                    System.out.println(arr[j-1] +" > " +arr[j] +", iya, maka tukar");
                    // swap elements (bertukar elemen)
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    swap++;
                } else {
                    System.out.println(arr[j-1] +" > " +arr[j] +", tidak");
                }
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
        int arr[] = {5, 4, 6, 2, 3};
        
        System.out.println("Nilai Array sebelum disorting :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
        System.out.println("");
        System.out.println("");
        
        bubbleSort(arr); // mengurutkan elemen array menggunakan bubble sort
        
        System.out.println("Nilai Array setelah disorting :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
        System.out.println("");
    }
}
