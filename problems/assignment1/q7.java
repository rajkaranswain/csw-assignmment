import java.util.Scanner;

public class q7
{
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the user name.");
		String str = sc.nextLine();
		
		sc.close();
		
		if(str.equals(System.getProperty("USERNAME"))) {
			System.out.println("Same");
		} else {
			System.out.println("Not Same.");
		}
	}
    
}
