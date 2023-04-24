//program to print product of factors
import java.util.Scanner;
public class Productoffac
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter the number");
	    int n = scan.nextInt();
	    int product = 1;
	    for(int i=1;i<=n;i++)
	    {
	        if(n%i==0)
	        {
	            product=product*i;
	        }
	    }
	    System.out.println(product);
		
	}
}
