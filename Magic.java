/*MAGIC number=sum of digits in a number should be equal to 1
325=3+2+5=10
10=1+0=1->magic number*/
import java.util.Scanner;
public class Magic
{
	public static void main(String[] args) 
	{
	    Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = scan.nextInt();
		while(n>9)
		{
		   int sum=0;
		   while(n!=0)
		   {
		       int ld = n%10;
		       sum=sum+ld;
		       n=n/10;
		   }
		   n=sum;
		}
		if(n==1)
		{
		    System.out.println("Magic number");
		}
		else
		{
		    System.out.println("NOt a magic number");
		}
	}
}
