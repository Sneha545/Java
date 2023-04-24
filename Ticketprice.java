//ticket price based on gender
import java.util.Scanner;
public class Ticketprice
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
		System.out.println("Enter the gender:");
		int ch = scan.next().charAt(0);
		if(ch=='M'||ch=='m')
		{
		    System.out.println("ticket price is 100rs");
		}
		else if(ch=='F'||ch=='f')
		{
		    System.out.println("ticket price is 20rs");
		}
		else if(ch=='T'||ch=='t') 
		{
		    System.out.println("ticket price is 20rs");
		}
		else if(ch=='C'||ch=='c') 
		{
		    System.out.println("ticket price is 5rs");
		}
		else if(ch=='S'||ch=='s') 
		{
		    System.out.println("ticket price is free");
		}
		else{
		    System.out.println("Enter valid input");
		}
		
	}
}
