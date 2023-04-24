//program to print count of digit in a number
/*count of digits
123 count=1
123%10=12 count=2
12%10=1 count=3
1%10=10count=123to neliminate last digit n=n/10*/
import java.util.Scanner;
public class Countofdigit
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = scan.nextInt();
		int count = 0;
		while(n!=0)
		{
		    count++;
		    int ld = n%10;
		    n=n/10;
		}
		System.out.println("The count of digits is:"+count);
	}
}
