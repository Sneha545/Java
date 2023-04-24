//program to print next palindrome
import java.util.Scanner;
public class Nextpalindrome
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = scan.nextInt();
		int temp=n;
		while(true)
		{
		    n++;
		    int rev=0;
		    while(temp!=0)
		    {
		        int ld= temp%10;
		        rev=rev*10+ld;
		        temp=temp/10;
		    }
		    if(temp==rev)
		    {
		        System.out.println("Next palindrome is : "+n);
		        break;
		    }
		}
	}
}
