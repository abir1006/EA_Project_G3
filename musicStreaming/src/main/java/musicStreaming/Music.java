package musicStreaming;

public class Music {
    private String musicName;
    private String artist;
    private String album;
    private String genre;
    private String releaseDate;

    public Music(String musicName, String artist, String album, String genre, String releaseDate) {
        this.musicName = musicName;
        this.artist = artist;
        this.album = album;
        this.genre = genre;
        this.releaseDate = releaseDate;
    }

    public String getMusicName() {
        return musicName;
    }

    public String getArtist() {
        return artist;
    }

    public String getAlbum() {
        return album;
    }

    public String getGenre() {
        return genre;
    }

    public String getReleaseDate() {
        return releaseDate;
    }
}
