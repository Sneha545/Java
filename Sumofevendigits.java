//sum of even digits in a Number
import java.util.Scanner;
public class Sumofevendigits
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = scan.nextInt();
		int esum=0;
		int count=0;
		while(n!=0)
		{
		    count++;
		    int ld = n%10;
		    if(ld%2==0)
		    {
		        esum=esum+ld;
		    }
		    n=n/10;
		}
		System.out.println("The sum of evendigits in a number is:"+esum);
	}
}
