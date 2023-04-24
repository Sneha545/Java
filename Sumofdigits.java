//Program to print sum of digits in a number
import java.util.Scanner;
public class Sumofdigits
{
	public static void main(String[] args) {
	    Scanner scan= new Scanner(System.in);
		System.out.println("Enter the number");
		int n = scan.nextInt();
		int sum=0;
		int count=0;
		while(n!=0)
		{
		    count++;
		    int ld = n%10;
		    sum=sum+ld;
		    n=n/10;
		}
		System.out.println(sum);
	}
}
