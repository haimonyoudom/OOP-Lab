import java.util.Scanner;

class Video
{
    static Scanner sc = new Scanner(System.in);
    String title;
    String uploader;
    int length;
    String type;
    
    Video()
    {
    }
    
    Video(String title, String uploader, int length, String type)
    {
        this.title = title;
        this.uploader = uploader;
        this.length = length;
        this.type = type;
    }
    
    static void listVideos(Video videos[])
    {
        System.out.println("=".repeat(70));
        System.out.printf("| %-4s | %-25s | %-15s | %-8s | %-6s |%n", "No", "Title", "Uploader", "Length", "Type");
        System.out.println("=".repeat(70));
        int displayCount = 0;
        for(int i = 0; i < videos.length; i++)
        {
            Video v = videos[i];
            if(v != null) {
                System.out.printf("| %-4d | %-25s | %-15s | %-8d | %-6s |%n", (i+1), v.title, v.uploader, v.length, v.type);
                displayCount++;
            }
        }
        if(displayCount == 0) {
            System.out.println("No video to display.");
        }
        System.out.println("=".repeat(70));
    }
    
    static void search(Video videos[], String keyword)
    {
        System.out.println("\n==== Video Search ====");
        System.out.println("Input title: " + keyword);
        
        int resultCount = 0;
        Video[] results = new Video[100];
        
        for(int i = 0; i < videos.length; i++)
        {
            if(videos[i] != null && (videos[i].title.toLowerCase().contains(keyword.toLowerCase()) || 
                    videos[i].uploader.toLowerCase().contains(keyword.toLowerCase())))
            {
                results[resultCount] = videos[i];
                resultCount++;
            }
        }
        
        if(resultCount == 0) {
            System.out.println("0 video found. Try again");
        } else {
            System.out.println(resultCount + " videos found:");
            for(int i = 0; i < resultCount; i++)
            {
                System.out.println((i+1) + ". " + results[i].title + " by " + results[i].uploader);
            }
        }
    }
}

public class task4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Video[] videos = new Video[100];
        int count = 0;
        
        videos[0] = new Video("Prey Eh Kert", "sin sisamuth", 5, "Music");
        videos[1] = new Video("Pel Del Trov Yum ", "Sinn Sisamouth", 4, "Music");
        videos[2] = new Video("Luoch Sneh Luoch Tuk", "Sinn Sisamouth", 6, "Music");
        videos[3] = new Video("G-David Song", "G-David", 3, "Music");
        count = 4;
        
        while(true)
        {
            System.out.println("\n==== Menu ====");
            System.out.println("1. Search");
            System.out.println("2. View all videos");
            System.out.println("3. Add a new video");
            System.out.println("4. Quit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();
            
            switch(choice)
            {
                case 1:
                    System.out.print("Input title: ");
                    String keyword = sc.nextLine();
                    Video.search(videos, keyword);
                    break;
                    
                case 2:
                    Video.listVideos(videos);
                    break;
                    
                case 3:
                    if(count < 100) {
                        System.out.println("\n==== Add a new video ====");
                        System.out.print("Title: ");
                        String title = sc.nextLine();
                        System.out.print("Uploader: ");
                        String uploader = sc.nextLine();
                        System.out.print("Length: ");
                        int length = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Type: ");
                        String type = sc.nextLine();
                        
                        videos[count] = new Video(title, uploader, length, type);
                        count++;
                        System.out.println("Video added successfully!");
                    } else {
                        System.out.println("Video storage is full!");
                    }
                    break;
                    
                case 4:
                    System.out.println("Exit ...");
                    break;
                    
                default:
                    System.out.println("Invalid option!");
                    break;
            }
            
            if(choice == 4) break;
        }
        
        sc.close();
    }
}
