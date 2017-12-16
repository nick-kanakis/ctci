package OOD.Q3_Jukebox;

/**
 * Created by Nicolas on 16/12/2017.
 */
public class Song {

    private long durationInSeconds;
    private String title;
    private int id;

    public Song(long durationInSeconds, String title, int id) {
        this.durationInSeconds = durationInSeconds;
        this.title = title;
        this.id = id;
    }

    public long getDurationInSeconds() {
        return durationInSeconds;
    }

    public void setDurationInSeconds(long durationInSeconds) {
        this.durationInSeconds = durationInSeconds;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }
}
