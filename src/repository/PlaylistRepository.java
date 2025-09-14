package repository;

import model.Playlist;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PlaylistRepository {
    private final List<Playlist> playlists = new ArrayList<>();

    public void save(Playlist playlist){
        playlists.add(playlist);
    }

    public List<Playlist> findAll(){
        return new ArrayList<>(playlists);
    }

    public List<Playlist> findByName(String name){
       return playlists.stream()
                .filter(p -> p.getName().equals(name))
                .collect(Collectors.toList());
    }

    public Playlist findById(Long id) throws IllegalArgumentException{
        return playlists.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Playlist not found"));
    }

    public void update(Long id, String name){
        Playlist playlist = playlists.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Playlist not found"));

        playlist.setName(name);
    }

    public void delete(Playlist playlist){
        playlists.remove(playlist);
    }


}
