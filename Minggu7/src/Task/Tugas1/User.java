package Task.Tugas1;

/**
 *
 * @author Fauzan
 */
public class User {
    public static void main(String[] args) {
        Televisi tv = new Televisi("TV Tempoe Doeloe, 14 inches", 10);
        String[] semuaChannel = {"RCTI", "SCTV", "INDOSIAR", "LA TV",
                                 "METRO TV", "TRANS TV", "TPI", "TV 7",
                                 "TVRI", "TV G", "AN TV"
        };
        String[] channelFavorit = {"RCTI", "SCTV", "INDOSIAR", "LA TV",
                                   "METRO TV", "TRANS V", "TPI", "TV 7"
        };
        
        System.out.println("Pak Lukman, membeli Televisi : " +tv.getDeskripsi());
        
        tv.getChannels();
        tv.setChannels(semuaChannel);
        tv.setChannels(channelFavorit);
        
        tv.setChannelAktif(3);
        tv.setVolume(10);
        tv.setChannelAktif(10);
        tv.setChannelAktif(1);
    }
}
