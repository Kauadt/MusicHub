package test;

import model.Music;
import model.Playlist;

public class PlaylistTest {
    public static void main(String[] args) {
        Playlist playlist = new Playlist("Nova Playlist");
        Music musicTest = new Music("Nome da música", "https://sla.com", "Kauã");
        playlist.addMusic(musicTest);
        for(Music music : playlist.getMusics()){
            System.out.println(music.getName());
        }

        playlist.removeMusic(musicTest);

        if(playlist.getMusics().isEmpty()){
            System.out.println("Playlist vazia");
        }
    }
}
