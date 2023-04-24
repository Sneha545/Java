//program yo print nth prime
import java.util.Scanner;
public class Nthprime
{
	public static void main(String[] args) 
	{
	    Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = scan.nextInt();
		int sln=1;
		for(int i=1;sln<=n;i++)
		{
		    int count=0;
		    for(int a=1;a<=i;a++)
		    {
		        if(i%a==0)
		        {
		            count++;
		        }
		    }
		    if(count==2)
		    {
		        if(sln==n)
		        {
		            System.out.println(sln+")"+i);
		        }
		        sln++;
		    }
		    
		}
	}
}
