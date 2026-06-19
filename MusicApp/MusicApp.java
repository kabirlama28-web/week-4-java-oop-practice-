class Song {
    String title;
    String artist;

    Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    void play() {
        System.out.println("Playing song");
    }
}

class PopSong extends Song {
    PopSong(String title, String artist) {
        super(title, artist);
    }

    @Override
    void play() {
        System.out.println("Playing Pop Song: " + title);
    }
}

class RockSong extends Song {
    RockSong(String title, String artist) {
        super(title, artist);
    }

    @Override
    void play() {
        System.out.println("Playing Rock Song: " + title);
    }
}

class JazzSong extends Song {
    JazzSong(String title, String artist) {
        super(title, artist);
    }

    @Override
    void play() {
        System.out.println("Playing Jazz Song: " + title);
    }
}

public class MusicApp {
    public static void main(String[] args) {

        Song[] playlist = {
                new PopSong("Song A","Artist A"),
                new RockSong("Song B","Artist B"),
                new JazzSong("Song C","Artist C")
        };

        for (Song song : playlist) {
            song.play();
        }
    }
}