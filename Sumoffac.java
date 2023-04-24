//program to print sum of factors of given Number
import java.util.Scanner;
public class Sumoffac
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = scan.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++)
		{
		    if(n%i==0)
		    {
		        sum=sum+i;
		    }
		}
		System.out.println(sum);
	}
}
