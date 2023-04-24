//program to print primes within a range
import java.util.Scanner;
public class Primeswithinrange
{
	public static void main(String[] args) 
	{
	    Scanner scan = new Scanner(System.in);
		System.out.println("Enter the min range");
		int m = scan.nextInt();
		System.out.println("Enter the max number");
		int n = scan.nextInt();
		int sln=1;
		for(int i=m;i<=n;i++)
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
		        System.out.println(sln+")"+i);
		        sln++;
		    }
		}
	}
}
