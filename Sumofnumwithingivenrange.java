//program to print sum of natural numbers with given range
import java.util.Scanner;
public class Sumofnumwithingivenrange
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter the first number");
	    int n = scan.nextInt();
	    System.out.println("Enter the second number");
	    int s = scan.nextInt();
	    int sum=0;
	    for(int i=n;i<=s;i++)
	    {
	        sum=sum+i;
	    }
	
		System.out.println("The sum of given numbers is:"+(sum));
	}
}
