package model;

import java.util.ArrayList;

public class Playlist {

    private long id;
    private static long nextId = 1;
    private String name;
    private ArrayList<Music> musics = new ArrayList<>();

    public Playlist(String name){
        this.name = name;
        this.id = nextId++;
    }

    public


}
