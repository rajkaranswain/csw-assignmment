import java.util.Scanner;

public class q5
{
    public static void main(String[] args) 
    {
		
		
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Path");
            String s = sc.nextLine();
            
            String s2 = s.replace('/' , System.getProperty("file.separator").charAt(0));
            System.out.println(s2);
        
        
	}
    
}
