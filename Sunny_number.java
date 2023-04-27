/*Sunny Number
any number in addition with 1 gives the perfect square the they are called sunny numbers
24+1=25=5*5
24 is sunny number*/
import java.util.Scanner;
public class Sunny_number
{
	public static void main(String[] args) 
	{
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter the number");
	    int n = scan.nextInt();
	    boolean issunny = false;
	    for(int i=1;i<=n;i++)
	    {
	        if((n+1)==i*i)
	        {
	            issunny = true;
	            break;
	        }
	    }
	    if(issunny == true)
	    {
	       System.out.println("Sunny"); 
	    }
	    else
	    {
	        System.out.println("Not a sunny");
	    }
		
	}
}
