import java.util.Scanner;

public class Main {

    private final static PlaylistController playlistControls = new PlaylistController();
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        scanner.useDelimiter("\\n");

        System.out.println("\nOlá, seja bem-vindo(a) ao Hub de músicas\n");
        var selectedOption = -1;

        do {
            System.out.println("|-------------- Operações --------------|");
            System.out.println("1 - Adicionar nova música");
            System.out.println("2 - Listar músicas da playlist");
            System.out.println("3 - Procurar música por identificador");
            System.out.println("4 - Remover música da playlist");
            System.out.println("|----------------------------------------|");
            System.out.print("Selecione uma operação: ");
            selectedOption = scanner.nextInt();

            switch (selectedOption){
                case 0 -> System.exit(200);
                case 1 -> playlistControls.addMusicInPlaylist();
                case 2 -> playlistControls.listAllMusics();
                case 3 -> playlistControls.listFoundMusicById();
                case 4 -> playlistControls.removeMusicFromPlaylistById();
                default -> System.out.println("Opção inválida");
            }

        } while (true);
    }

}
