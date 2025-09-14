package model;

public class Music {

    private String name;
    private String url;
    private String author;
    private long id;
    private static long nextId = 1;

    public Music(String name, String url, String author){
        this.name = name;
        this.url = url;
        this.author = author;
        this.id = nextId++;
    }

    public String getName() { return name; }
    public String getUrl() { return url; }
    public String getAuthor() { return author; }
    public long getId() { return id; }
}

