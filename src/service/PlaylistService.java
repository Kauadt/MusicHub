package service;

import model.Playlist;
import repository.PlaylistRepository;

import java.util.List;

public class PlaylistService {

    PlaylistRepository repository = new PlaylistRepository();

    public void createPlaylist(String name) throws IllegalArgumentException{
        if(name == null || name.isBlank()){
            throw new IllegalArgumentException("Playlist name cannot be empty");
        }

        Playlist playlist = new Playlist(name);
        repository.save(playlist);
    }

    public void deletePlaylist(Long id) throws IllegalArgumentException{
            Playlist playlist = repository.findById(id);
            repository.delete(playlist);
    }

    public List<Playlist> listAll(){
        return repository.findAll();
    }

    public List<Playlist> listByName(String name){
        return repository.findByName(name);
    }

    public void updatePlaylistName(Long id, String name) throws IllegalArgumentException{
        if(name == null || name.isBlank()){
            throw new IllegalArgumentException("Playlist name cannot be empty");
        }
        repository.update(id, name);
    }

}
