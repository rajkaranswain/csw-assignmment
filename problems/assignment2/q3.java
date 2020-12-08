import java.util.Scanner;

public class q3 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        String line = sc.nextLine();
        int vowels = 0;
        sc.close();
        char arr[] = line.toCharArray();

        line = line.toLowerCase();
        int x = line.length();
        System.out.println(x);
        for(int i = 0; i < line.length(); ++i)
        {
            char ch = arr[i];
           // System.out.println(ch);
            if(ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u')
            {
                System.out.println(ch);
                ++vowels;
            }
        }

        System.out.println(vowels);
    }
    
}
