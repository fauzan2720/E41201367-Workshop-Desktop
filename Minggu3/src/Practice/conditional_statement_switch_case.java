package Practice;

import java.util.Scanner;

/**
 *
 * @author Fauzan
 */
public class conditional_statement_switch_case {
    public static void main(String[] args) {
        String lampu;
        Scanner input = new Scanner(System.in);

        System.out.print("Warna lampu rambu lalu lintas yang dialami : ");
        lampu = input.nextLine();
        
        switch (lampu) {
            case "merah":
                System.out.println("Berhenti!");
                break;
            case "kuning":
                System.out.println("Siap-siap untuk melaju");
                break;
            case "hijau":
                System.out.println("Segera jalan");
                break;
            default:
                System.out.println("Anda memasukkan warna yang salah!");
        }
    }
}
