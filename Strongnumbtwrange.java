//program to print stromg numbers between given range
import java.util.Scanner;
public class Strongnumbtwrange
{
	public static void main(String[] args) 
	{
	    Scanner scan = new Scanner(System.in);
		System.out.println("Enter the min number");
		int m = scan.nextInt();
		System.out.println("Enter the max number");
		int n = scan.nextInt();
		for(int i=m;i<=n;i++)
		{
		    int temp=i;
		    int sum=0;
		    while(temp!=0)
		    {
		        int fact=1;
		        int ld = temp%10;
		        for(int a=1;a<=ld;a++)
		        {
		            fact=fact*a;
		        }
		        sum=sum+fact;
		        temp=temp/10;
		    }
		    if(sum==i)
		    {
		        System.out.println(i);
		    }
		}
	}
}
