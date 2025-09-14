package test;

import model.Playlist;
import repository.PlaylistRepository;

public class PlaylistiRepositoryTest {
    public static void main(String[] args) {
        PlaylistRepository repository = new PlaylistRepository();

        repository.save(new Playlist("Playlist 1"));
        repository.save(new Playlist("Playlist 2"));
        repository.save(new Playlist("Playlist 3"));

        System.out.println(repository.findAll());

    }
}
