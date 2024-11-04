package mk.ukim.finki.wp.lab.repository;

import mk.ukim.finki.wp.lab.model.Artist;
import mk.ukim.finki.wp.lab.model.Song;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Repository
public class SongRepository {
    static List<Song> SONGS = Arrays.asList(
            new Song("001", "Blowin' in the Wind", "Folk", 1963),
            new Song("002", "Shake It Off", "Pop", 2014),
            new Song("003", "Bohemian Rhapsody", "Rock", 1975),
            new Song("004", "Hello", "Soul", 2015),
            new Song("005", "Let It Be", "Rock", 1970)
    );

    public List<Song> findAll() {
        return SONGS;
    }

    public Optional<Song> findByTrackID(String trackId) {
        for (int i = 0; i < SONGS.size(); i++) {
            if (SONGS.get(i).getTrackId().equals(trackId)) {
                return Optional.of(SONGS.get(i));
            }
        }
        return Optional.empty();
    }

    public Artist addArtistToSong(Artist artist, Song song) {
        for(Song s: SONGS) {
            if(s.getTrackId().equals(song.getTrackId())){
                s.getPerformers().add(artist);
                return artist;
            }
        }

        return null;
    }
}
