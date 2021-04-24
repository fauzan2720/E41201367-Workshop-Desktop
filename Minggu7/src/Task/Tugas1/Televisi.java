package Task.Tugas1;

/**
 *
 * @author Fauzan
 */
public class Televisi {

    private String deskripsi;
    private int jumlahChannel;
    private String[] channels;
    private int channelsAktif;
    private int volume;
    
    public Televisi (String nama, int jumlahChannel) {
        this.deskripsi = nama;
        this.jumlahChannel = jumlahChannel;
    }

    public String getDeskripsi() {
        return deskripsi;
    }
    
    public int getJumlahChannels() {
        return jumlahChannel;
    }

    public String[] getChannels() {
        if (channels == null) {
            System.out.println("Belum ada channel yang diset!");
        }
        return channels;
    }
    
    public void setChannels(String[] channels) {
        if (channels.length > jumlahChannel) {
            System.out.println("Maaf TV ini hanya dapat menyimpan "
                    +jumlahChannel +" channel");
        } else {
            this.channels = channels;
            System.out.println("Informasi channel berhasil diupdate!");
        }
    }
    
    public int getChannelAktif() {
        return channelsAktif;
    }

    public void setChannelAktif(int channellAktif) {
        if (channellAktif > channels.length) {
            System.out.println("Channel yang anda inginkan belum diset");
            return;
        }
        this.channelsAktif = channellAktif;
        System.out.println("Pindah channel ke : " +channels[channellAktif]);
    }
    
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Intensitas volume sekarang : " +volume);
    }
}
