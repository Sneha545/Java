//program to print smallest digit of a Number
import java.util.Scanner;
public class Smallestdigit
{
	public static void main(String[] args) 
	{
	    Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = scan.nextInt();
		int smallest=9;
		int temp=n;
		while(temp!=0)
		{
		    int ld= temp%10;
		    if(ld<smallest)
		    {
		        smallest=ld;
		    }
		    temp=temp/10;
		}
		System.out.println("The smallest digit of a number is : "+smallest);
	}
}
