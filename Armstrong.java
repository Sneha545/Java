/*program to print armstrong number or not
armstrong num-count of digits in a number is the sum of squares of digits should be equal to number
ex:56=s^2+6^2 should be equal to 56
545=5^3+4^3+5^3 should be equal to 545*/
import java.util.Scanner;
public class Armstrong
{
	public static void main(String[] args) 
	{
	    Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = scan.nextInt();
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
		    int exp=1;
		    for(int i=1;i<=count;i++)
		    {
		        exp=exp*ld;
		    }
		    sum=sum+exp;
		    temp=temp/10;
		}
		if(sum==n)
		{
		    System.out.println("Armstrong");
		}
		else
		{
		    System.out.println("Not a armstrong");
		}
	}
}
