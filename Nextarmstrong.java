//program to print next armstrong Number
import java.util.Scanner;
public class Nextarmstrong
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
		    int temp=n;
		    while(temp!=0)
		    {
		        count++;
		        temp=temp/10;
		    }
		    temp=n;
		    int sum=0;
		    while(temp!=0)
		    {
		        int ld = temp%10;
		        int exp = 1;
		        for(int a=1;a<=count;a++)
		        {
		            exp=exp*ld;
		        }
		        sum=sum+exp;
		        temp=temp/10;
		    }
		    if(sum==n)
		    {
		        System.out.println("The next armstrong number is :"+n);
		        break;
		    }
		}
	}
}
