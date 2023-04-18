//program to print numbers within a range
import java.util.Scanner;
public class Numwithinrange
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
		System.out.println("Enter the min range:");
		int n = scan.nextInt();
		System.out.println("Enter the max range:");
		int s = scan.nextInt();
		for(int i=n;i<=s;i++)
		{
		    System.out.println(i);
		}
		
	}
}
