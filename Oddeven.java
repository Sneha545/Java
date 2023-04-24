//program to print product of  both even and odd digits in a Number
import java.util.Scanner;
public class Oddeven
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter the number");
	    int n = scan.nextInt();
	    int oproduct = 1;
	    int esum = 0;
	    while(n!=0)
	    {
	        int ld = n%10;
	        if(n%2==0)
	        {
	            esum=esum+ld;
	        }
	        else
	        {
	            oproduct=oproduct*ld;
	        }
	        n=n/10;
	    }
	    System.out.println("The product of odd digits of number is :"+oproduct);
	    System.out.println("The sum of even digits of number is :"+esum);
	}
}
