
//nature of number
import java.util.Scanner;
public class Natureofnum
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = scan.nextInt();
		if(n>0)
		{
		    System.out.println("positive number");
		}
		else if(n<0)
		{
		    System.out.println("negative number");
		}
		else 
		{
		    System.out.println("number is neutral");
		}
		
	}
}
