import java.util.Scanner;

public class task7 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        String[] vowchar = {"A","E","I","O","U","a","e","i","o","u"};
        int vowel = 0 ,con=0,space = 0;
        System.out.print("Input a sentence: ");
        String text = sc.nextLine();

        int num = text.length();
        String[] textArr = text.split(""); 
        for (int i = 0; i < num;i++)
        {
             boolean isVowel = false;
            for(int j = 0 ; j <10; j++)
            {
               
                if(textArr[i].equals(vowchar[j])) 
                {
                    vowel ++;
                    isVowel = true;
                    break;
                }
            }
            if(textArr[i].equals(" "))
            {
                space++;
            }
            else if (!isVowel)
            {
                con++;
            }
            
        }
        System.out.println("vowels : "+vowel);
        System.out.println("Consonat : "+con);
        System.out.println("Space : "+space);

    }
}
