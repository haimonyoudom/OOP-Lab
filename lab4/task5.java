import java.util.Scanner;
import java.util.ArrayList;
class Song{
    String title ,singer ,length;
    float price;
    Song(String title,String singer,String length,float price)
    {
        this.title=title;
        this.singer=singer;
        this.length=length;
        this.price=price;
    }
    public void displaySong(ArrayList<Song> songs)
    {
        if(songs != null){
        System.out.println("=".repeat(59));
        System.out.printf("| %-3s | %-20s | %-10s | %-6s | %-4s |%n",
                        "No" ,"Title Song","Singer","Length","Cost");
        System.out.println("=".repeat(59));
        for(int i = 0; i< songs.size();i++)
        {
            Song s = songs.get(i);
            System.out.printf("| %-3d | %-20s | %-10s | %-6s | %-4.2f |%n",
                            (i+1),s.title,s.singer,s.length,s.price);
        }
        System.out.println("=".repeat(59));
        }
        else {
            System.out.println("None of song");
        }
    }
}
class Album extends Song{
    String albumTitle,genre;
    ArrayList<Song> songs = new ArrayList<>();

    Album(String albumTitle ,String genre,String title
        ,String singer,String length,float price)
    {
        super(title, singer, length, price);
        this.albumTitle=albumTitle;
        this.genre=genre;
    }
    
    public String getTitle()
    {
        return title;
    }
    public String getGenre()
    {
        return genre;
    }
}
public class task5 {
    public static void main(String[] args)
    {
        ArrayList<Album> albums = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        //set album name Skull1 ,Skull2 with genre Hiphop
        Album skull1 = new Album("Skull1", "Hiphop", "Solo", "Vannda", "3mins", 5);
        Album skull2 = new Album("Skull2", "Hiphop", "Babe MAMA", "Vannda", "2mins", 15);
        albums.add(skull1);
        albums.add(skull2);
        while (true)
        {
            System.out.println("===== Menu =====");
            System.out.println("1. View a music store");
            System.out.println("2. add a song");
            System.out.println("3. Create an album");
            System.out.println("4. Quit");
            System.out.print("Choose an option : ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("===== Music Store =====");
                    if(albums.isEmpty())
                    {
                        System.out.println("No albums available.");
                    }
                    else
                    {
                        for(int i = 0; i < albums.size(); i++)
                        {
                            Album album = albums.get(i);
                            System.out.println((i+1) + ". Album: " + album.albumTitle + "\nGenre: " + album.genre);
                            if(album.songs.isEmpty())
                            {
                                System.out.println("No songs in this album.");
                            }
                            else
                            {
                                album.displaySong(album.songs);
                            }
                            System.out.println();
                        }
                    }

                    break;
                case 2:
                    System.out.println("===== Add a new song =====");
                    System.out.println("Select following Album: ");
                    if(albums.isEmpty())
                    {
                        System.out.println("No albums available. Please create an album first.");
                        break;
                    }
                    for(int i = 0; i < albums.size(); i++)
                    {
                        System.out.println((i+1) + ". " + albums.get(i).albumTitle);
                    }
                    System.out.print("Choose album (number): ");
                    int albumChoice = sc.nextInt();
                    sc.nextLine();

                    if(albumChoice < 1 || albumChoice > albums.size())
                    {
                        System.out.println("Invalid album choice.");
                        break;
                    }

                    System.out.print("Song title: ");
                    String songTitle = sc.nextLine();
                    System.out.print("Singer: ");
                    String singer = sc.nextLine();
                    System.out.print("Length: ");
                    String length = sc.nextLine();
                    System.out.print("Price: ");
                    float price = sc.nextFloat();
                    sc.nextLine();

                    albums.get(albumChoice-1).songs.add(new Song(songTitle, singer, length, price));
                    System.out.println("Song added successfully!");
                    System.out.println();
                    break;
                case 3:
                    System.out.println("===== Create new Album =====");
                    System.out.print("Album title: ");
                    String albumTitle = sc.nextLine();
                    System.out.print("Genre: ");
                    String genre = sc.nextLine();

                    albums.add(new Album(albumTitle, genre, "", "", "", 0));
                    System.out.println("Album '" + albumTitle + "' created successfully!");
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Exit Program ....");
                    break;
                default:
                    System.out.println("Invalid choice ...");
                    break;
            }
            if(choice == 4){break;}
        }

        sc.close();
    }
}
