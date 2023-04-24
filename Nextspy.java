//program to print next spy Number
import java.util.Scanner;
public class Nextspy
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = scan.nextInt();
		while(true)
		{
		       n++;
		       int temp=n;
		       int sum=0;
		       int prod=1;
		       while(temp!=0)
		       {
		          int ld = temp%10;
		          sum=sum+ld;
		          prod=prod*ld;
		          temp=temp/10;
		       }
		       if(sum==prod)
		       {
		        System.out.println(n);
		        break;
		       }
		  
		    
		}
