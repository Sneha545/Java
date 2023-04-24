//program to print product of even digits in a Number
import java.util.Scanner;
public class Productofeven
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter the number");
	    int n = scan.nextInt();
	    int eproduct = 1;
	    while(n!=0)
	    {
	        int ld = n%10;
	        if(n%2==0)
	        {
	            eproduct=eproduct*ld;
	        }
	        n=n/10;
	    }
	    System.out.println("The product of even digits of number is :"+eproduct);
	}
}
