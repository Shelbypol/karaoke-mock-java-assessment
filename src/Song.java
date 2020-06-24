import java.util.List;

public class Song {
    //======== PROPERTIES
    private String title;
    private String artist;
    private List<String> lyrics;

    //========= CONSTRUCTOR
    public Song(String title, String artist, List<String> lyrics) {
        this.title = title;
        this.artist = artist;
        this.lyrics = lyrics;
    }

    //========= PARSE LYRICS
    public static String parseLyrics(String input) {
        String[] inputSplit = input.split(" ");
        String splitInput = "";
        for (String i : inputSplit) {
            splitInput += i;
        }
            return splitInput;
    }

    public static void main(String[] args) {
        System.out.println(parseLyrics("the quick brown fox jumped over the lazy dog."));

    }

    //========= GETTERS & SETTERS
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public List<String> getLyrics() {
        return lyrics;
    }

    public void setLyrics(List<String> lyrics) {
        this.lyrics = lyrics;
    }


}
