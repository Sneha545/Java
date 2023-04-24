//program to print next prime
import java.util.Scanner;
public class Nextprime
{
	public static void main(String[] args) 
	{
	    Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = scan.nextInt();
		while(true)
		{
		    n++;
		    int count=0;
		    for(int i=1;i<=n;i++)
		    {
		        if(n%i==0)
		        {
		            count++;
		        }
		    }
		    if(count==2)
		    {
		        System.out.println("Next prime number is:"+n);
		        break;
		    }
		}
	}
}
