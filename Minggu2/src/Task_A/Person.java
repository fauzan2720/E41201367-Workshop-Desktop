package Task_A;

/**
 * @author Fauzan
 * This class will define a person and the information about a person that is needed
 */
public class Person {
    String fName, lName, stuStatus;
    int stuId;
    
    public void Person(String fName, String lName, int stuId, String stuStatus) { // menyertakan parameter
        // membuat konstruktor yang akan menginisialisasi variabel
        this.fName = fName;
        this.lName = lName;
        this.stuId = stuId;
        this.stuStatus = stuStatus;
    }

    // membuat method
    public String fName() {
        return fName;
    }

    public String lName() {
        return lName;
    }

    public int stuId() {
        return stuId;
    }

    public String stuStatus() {
        return stuStatus;
    }
    
    // menampilkan method main
    public void show() {
        System.out.println("---------- Student Identity ----------");
        System.out.println("Student Name: " +fName +" " +lName);
        System.out.println("Student ID: " +stuId);
        System.out.println("Student Status: " +stuStatus);
    }
    
    public static void main(String[] args) {
        Person identity = new Person();
        identity.Person("Lisa", "Pambolo", 123456789, "Active");
        identity.show();
    }
}
