import java.util.Scanner;
public class q7 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string"); 
        String str = sc.nextLine();
        String t ="";
        sc.close();
        for(int i = 0 ; i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(ch !=' ')
            {
                t=t+ch;
            }
            else
            {
                System.out.print(Character.toUpperCase(t.charAt(0))+".");
                t="";
            }
        }
        
        String temp="";
        for(int j=0;j<t.length();j++)
        {
            if(j==0)
            {
                temp = temp+Character.toLowerCase(t.charAt(0));
            }
            else
            {
                temp = temp +Character.toLowerCase(t.charAt(j));
            }
           
        }     
        System.out.print(temp);
        
    }
    
}
