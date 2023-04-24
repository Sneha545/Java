//program to print largest digit of a number
import java.util.Scanner;
public class Largestdigit
{
	public static void main(String[] args) 
	{
	    Scanner scan = new Scanner(System.in);
		System.out.println("ENter the number");
		int n = scan.nextInt();
		int largest=0;
		int temp=n;
		while(temp!=0)
		{
		    int ld = temp%10;
		    if(ld>largest)
		    {
		        largest=ld;
		    }
		    temp=temp/10;
		}
		System.out.println("The largest digit of a number is:"+largest);
		
	}
}
