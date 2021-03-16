package Task_C;

public class declaration_error {
    public static void main(String[] args) {
        boolean gameOver = false; //tidak ada kesalahan dalam pendeklarasian variable
        int students=50,classes=3; //tidak ada kesalahan dalam pendeklarasian variable
        double sales_tax; //tidak ada kesalahan dalam pendeklarasian variable
        short number1; //tidak ada kesalahan dalam pendeklarasian variable

        int 2beOrNot2be; /* terjadi kesalahan pada pendeklarasian variable tersebut, karena 
                            nama variabel tersebut berawalan angka. Pada penamaan variabel 
                            tidak diperbolehkan diawali menggunakan angka atau bilangan */

        float price index; /* terjadi kesalahan pada pendeklarasian variable tersebut, karena 
                              pada penamaan variabel tidak boleh menggunakan spasi */

        double lastYear'sPrice; 
                            /* terjadi kesalahan pada pendeklarasian variable tersebut, karena 
                            pada penamaan variabel tidak boleh menggunakan simbol kecuali underscore "_" */
        long class; /* terjadi kesalahan pada pendeklarasian variable tersebut, karena class 
                       merupakan reserved word atau keyword java yang telah tertanam di dalam program java */
        
        System.out.println(gameOver);
        System.out.println(students);
        System.out.println(classes);
        System.out.println(sales_tax);
        System.out.println(number1);
        System.out.println(2beOrNot2be);
        System.out.println(price index);
        System.out.println(lastYear'sPrice);
        System.out.println(class);
    }
}
