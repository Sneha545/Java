//program to print both sum of even and odd digits in a number
import java.util.Scanner;
public class EvenandOddsum
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = scan.nextInt();
		int osum=0;
		int esum=0;
		while(n!=0)
		{
		    int ld = n%10;
		    if (n%2==0)
		    {
		        esum=esum+ld;
		    }
		    else
		    {
		        osum=osum+ld;
		    }
		    n=n/10;
		}
		System.out.println("The sum of even digits in a number is :"+esum);
		System.out.println("The sum of odd digits in a number is :"+osum);
	}
}
