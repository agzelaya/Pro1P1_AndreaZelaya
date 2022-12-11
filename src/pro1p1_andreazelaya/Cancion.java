package pro1p1_andreazelaya;

public class Cancion {
    
    private String song;
    private String album;
    private String artist;
    private int year;
    private int seconds;
    
    public Cancion(String song, String album, String artist, int seconds, int year){
        this.song = song;
        this.album = album;
        this.artist = artist;
        this.year = year;
        this.seconds = seconds;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int length) {
        this.seconds = seconds;
    }
    
    
    
}
