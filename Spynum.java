//Spy Number-sum of digits in a number is equal to product of digits in a number.ex:123-1+2+3=1*2*3=6
import java.util.Scanner;
public class Spynum
{
	public static void main(String[] args) 
	{
	    Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = scan.nextInt();
		int sum=0;
		int product=1;
		while(n!=0)
		{
		    int ld = n%10;
		    sum=sum+ld;
		    product=product*ld;
		    n=n/10;
		}
		if(sum==product)
		{
		    System.out.println("spy");
		}
		else
		{
		    System.out.println("not a spy");
		}
		
	}
}
