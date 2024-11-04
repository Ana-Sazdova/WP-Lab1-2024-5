package mk.ukim.finki.wp.lab.repository;

import mk.ukim.finki.wp.lab.model.Artist;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Repository
public class ArtistRepository {
    private static List<Artist> ARTISTS = Arrays.asList(
            new Artist(1L, "Bob", "Dylan", "An iconic American singer-songwriter and Nobel laureate known for his influential folk and rock music."),
            new Artist(2L, "Taylor", "Swift", "An American singer-songwriter known for her narrative songwriting and genre versatility."),
            new Artist(3L, "Freddie", "Mercury", "The legendary frontman of Queen, celebrated for his powerful vocals and dynamic stage presence."),
            new Artist(4L, "Adele", "Adkins", "A British singer-songwriter famous for her soulful voice and deeply personal ballads."),
            new Artist(5L, "Paul", "McCartney", "An English singer-songwriter and former Beatle, one of the most successful composers and performers in music history.")
    );

    public List<Artist> findAll() {
        return ARTISTS;
    }

    public Optional<Artist> findById(Long id) {
        for (int i = 0; i < ARTISTS.size(); i++) {
            if (ARTISTS.get(i).getId() == id) {
                return Optional.of(ARTISTS.get(i));
            }
        }

        return Optional.empty();
    }
}
