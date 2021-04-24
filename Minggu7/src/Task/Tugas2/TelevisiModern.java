package Task.Tugas2;

import Task.Tugas1.Televisi;

/**
 *
 * @author Fauzan
 */
public class TelevisiModern extends Televisi{
    public static final String TELETEXT = "Teletext";
    public static final String TV = "Televisi";
    private String diskTray = "";
    
    public TelevisiModern(String nama, int jumlahChannel) {
        super(nama, jumlahChannel);
    }
    
    public void setModusTampilan(String tampilan) {
        switch(tampilan) {
            case TELETEXT :
                System.out.println("Modus tampilan : " +TELETEXT);
                break;
            case TV :
                System.out.println("Modus tampilan : " +TV);
                break;
            default :
                System.out.println("Tidak ada tampilan yang dicari");
        }
    }
    
    public void setHalamanTeletext(int halamanTeletext) {
        System.out.println("Berpindah ke halaman teletext " +halamanTeletext);
    }
    
    public void setDiscTray(String cd) {
        this.diskTray = cd;
    }
    
    public String getDiscTray() {
        return diskTray;
    }
    
    public void playCD() {
        if (diskTray == "") {
            System.out.println("Tidak ada CD di dalam diisc tray!");
        } else {
            System.out.println("Memutar Film " +diskTray);
        }
    }
}
