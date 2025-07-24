import java.util.ArrayList;
import java.util.Scanner;

public class PlaylistController {

    private final ArrayList<Music> playlist = new ArrayList<>();
    private final Scanner scanner = new Scanner(System.in);

    // Adicionar música

    public void addMusicInPlaylist(){
        breakLines();

        System.out.println("\n\nInforme o nome da música: ");
        var name = scanner.nextLine();

        System.out.println("Informe a URL da música: ");
        var url = scanner.nextLine();

        System.out.println("Informe o autor da música: ");
        var author = scanner.nextLine();

        var music = new Music();
        music.setName(name);
        music.setUrl(url);
        music.setAuthor(author);

        playlist.add(music);
        System.out.println("Música adicionada a playlist");
    }

    // Listar músicas
    public void listAllMusics(){
        breakLines();

        boolean playlistIsEmpty = verifyPlaylistIsEmpty();
        if(playlistIsEmpty) return;

        for (Music music : playlist) {
            System.out.printf("id %s |%s| %s - %s\n",music.getId(), music.getUrl(), music.getName(), music.getAuthor());
        }
        System.out.print("\n");
    }

    // Remover músicas
    public void removeMusicFromPlaylistById(){
        breakLines();

        boolean playlistIsEmpty = verifyPlaylistIsEmpty();
        if(playlistIsEmpty) return;

        System.out.println("Por favor, informe o ID da música: ");
        var selectedId = scanner.nextLong();
        Music musicToRemove = findMusicInPlaylist(selectedId);

        if(musicToRemove == null){
            System.out.println("Música não encontrada na playlist. Tente novamente!");
            return;
        }

        playlist.remove(musicToRemove);
        System.out.println("Música removida com sucesso!");
    }

    public static void breakLines() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
    }

    // Listar música por ID
    public void listFoundMusicById(){
        breakLines();

        boolean playlistIsEmpty = verifyPlaylistIsEmpty();
        if(playlistIsEmpty) return;

        System.out.print("Por favor, informe o identificador da música: ");
        long id = scanner.nextLong();
        Music musicToList = findMusicInPlaylist(id);

        if(musicToList == null) {
            System.out.println("Música não encontrada na playlist. Tente novamente!");
            return;
        }

        System.out.printf("id %s |%s| %s - %s\n",
                musicToList.getId(),
                musicToList.getUrl(),
                musicToList.getName(),
                musicToList.getAuthor());
    }


    private Music findMusicInPlaylist(long selectedId){
        Music foundMusic = null;
        for (Music music : playlist){
            long musicId = music.getId();
            if(musicId == selectedId){
                foundMusic = music;
                break;
            }
        }

        return foundMusic;
    }

    private boolean verifyPlaylistIsEmpty(){
        if (playlist.isEmpty()) {
            System.out.println("A playlist está vazia.\n");
            return true;
        }
        return false;
    }


}
