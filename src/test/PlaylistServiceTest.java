package test;

import model.Playlist;
import service.PlaylistService;

import java.util.List;

public class PlaylistServiceTest {
    public static void main(String[] args) {
        PlaylistService service = new PlaylistService();

        service.createPlaylist("MinhasMúsicas");
        service.createPlaylist("MinhasMúsicas2");
        service.createPlaylist("MinhasMúsicassss");
        List<Playlist> foundByName = service.listByName("MinhasMúsicas2");

        for(Playlist playlist : service.listAll()){
            System.out.printf("%s | %s\n", playlist.getId(), playlist.getName());
        }

        System.out.println(foundByName);
        service.deletePlaylist(1L);
        service.updatePlaylistName(2L, "Músicas");

        for(Playlist playlist : service.listAll()){
            System.out.printf("%s | %s\n", playlist.getId(), playlist.getName());
        }
    }
}
