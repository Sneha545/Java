//program to print product of natural numbers with given range
import java.util.Scanner;
public class Productofnumwithingivenrange
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter the first number");
	    int n = scan.nextInt();
	    System.out.println("Enter the second number");
	    int s = scan.nextInt();
	    int product=1;
	    for(int i=n;i<=s;i++)
	    {
	        product=product*i;
	    }
	
		System.out.println(product);
	}
}
