package Task_B;

/**
 *
 * @author Fauzan
 */
public class ManagingPeople {
    public static void main(String[] args) {
        Person p1 = new Person("Lisa", "Pambolo", 123456789, "Active");
        Person p2 = new Person("Fauzan", "Abdillah", 41201367, "Active");

        // jika p1 dan p2 berstatus aktif
        if (p1.stuStatus() == p2.stuStatus()) {
            System.out.println(p1.fName() +" " +p1.lName() +" are both in active status with " +p2.fName() +" " +p2.lName());
        } else {
            System.out.println(p1.fName() +" " +p1.lName() +"are NOT both in active status with " +p2.fName() +" " +p2.lName());
        }

    }
}
