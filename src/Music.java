public class Music {

    private String name;
    private String url;
    private String author;
    private long id;

    private static long nextId = 1;

    public Music(){
        this.id = nextId++;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName() { return name; }

    public void setUrl(String url){
        this.url = url.trim();
    }

    public String getUrl() { return url; }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() { return author; }

    public long getId() {
        return id;
    }
}

