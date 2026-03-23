/*Youtube.java */
import java.util.ArrayList;

class User{
    String username,email;
    User(String username)
    {
        this.username=username;
    }
}
class Video{
    String id,title,duration;
    int likes,views;
    User u;
    Video(String id,String title,int likes ,int views,String duration,User u)
    {
        this.id=id;
        this.title=title;
        this.duration=duration;
        this.likes=likes;
        this.views=views;
        this.u=u;
    }
    void display()
    {
        
        System.out.printf("| %-5s | %-17s | %-8d | %-6d | %-8s | %-15s |%n",id,title,views,likes,duration,u.username);
        System.out.println("=".repeat(75));
    }
}
public class Youtube {
    public static void main(String[] args) {
        ArrayList<Video> videos = new ArrayList<>();
        
        User john = new User("john");

        videos.add (new Video("001", "Java Tutorial", 50000, 4500, "10:23", john));

        videos.add(new Video("002", "OOP Explained", 30000, 3000, "08:15", john));
        
        videos.add(new Video("003", "Data Structures", 20000, 1800, "15:40", john));

        System.out.printf("| %-5s | %-17s | %-8s | %-6s | %-8s | %-15s |%n","Id","Title","views","likes","duration","u.username");
        System.out.println("=".repeat(75));
        for (Video v : videos) {
            v.display();
        }
    }
}
