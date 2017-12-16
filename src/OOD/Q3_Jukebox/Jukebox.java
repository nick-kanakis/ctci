package OOD.Q3_Jukebox;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nicolas on 16/12/2017.
 */
public class Jukebox {

    private ArrayList<Song> songs;
    private PaymentModule paymentModule = new PaymentModule();
    private SpeakerUnit speakerUnit = new SpeakerUnit();

    public Jukebox(ArrayList<Song> songs) {
        this.songs = songs;
    }

    public List<Song> getListOfSongs(){
        return songs;
    }

    public void playSong(int songId, int paymentAmount){
        int paymentCode = paymentModule.pay(songId, paymentAmount);

        if(paymentModule.isPaymentCompleted(paymentCode)){
            speakerUnit.playSong(songId);
        } else {
            throw new RuntimeException("Payment is not completed!");
        }
    }
}
