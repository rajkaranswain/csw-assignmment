import java.util.Scanner;

public class q6
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner (System.in);
        int i,j;
        String temp;
        int n=sc.nextInt();
        String s[]=new String[n];
        for(i=0;i<s.length;i++)
        {
            s[i]=sc.next();
           
        }
        
        for(i=0;i<s.length;i++)
        {
            for(j=i;j<s.length-1;j++)
            {
                if(s[j].compareTo(s[j+1])>0)
                {
                    temp=s[j];
                    s[j]=s[j+1];
                    s[j+1]=temp;
                }
            }
        }
        for(i=0;i<s.length;i++)
        {
            System.out.println(s[i]);
        }
      
    }
}