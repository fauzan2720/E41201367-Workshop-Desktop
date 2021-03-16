package Task_B;

/* @author Fauzan
 * This class will define a person and the information about a person that is needed */
public class Person {
    String fName, lName, stuStatus;
    int stuId;

    public Person(String fName, String lName, int stuId, String stuStatus) { // menyertakan parameter
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
}
