import java.util.Scanner;

public class q5 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        str=str.toLowerCase();
        String x[]=str.split(" ");
        StringBuilder a=new StringBuilder(str.length());
        for(int i=0;i<x.length;++i)
        {
            if(i>0)
            a.append(" ");
            a.append(Character.toUpperCase(x[i].charAt(0))).append(x[i].substring(1));
        }
        System.out.println(a);
sc.close();
    }
    
}
