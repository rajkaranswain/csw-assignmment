import java.util.Scanner;

public class q4
{
    public static void main(String[] args) 
    {
        System.out.println("enter the string without space");
        Scanner sc = new Scanner(System.in);
        int count[]= new int[26];
        String str = sc.nextLine();
        sc.close();
        str=str.toLowerCase();
        int i ;
        for(i=0;i<str.length();i++)
        {
            count[str.charAt(i)-'a']++;
        }
        for(i=0;i<str.length();i++)
        {
            if(count[str.charAt(i)-'a']!= 0)
            {
                System.out.print(str.charAt(i));
                System.out.print(count[str.charAt(i)-'a']+" ");
                count[str.charAt(i)-'a']=0;
            }
        }
    }
}