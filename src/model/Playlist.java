package model;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private static long nextId = 1;

    private long id;
    private String name;
    private List<Music> musics = new ArrayList<>();

    public String getName(){ return this.name; }
    public Long getId() { return this.id; }

    public Playlist(String name){
        this.name = name;
        this.id = nextId++;
    }

    public List<Music> getMusics(){ return this.musics; }

    public void addMusic(Music music){
        musics.add(music);
    }

    public void removeMusic(Music music){
        musics.remove(music);
    }

   public void setName(String name){
        this.name = name;
   }

}
