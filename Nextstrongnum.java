//program to print next palindrome
import java.util.Scanner;
public class Nextstrongnum
{
	public static void main(String[] args) 
	{
	    Scanner scan = new Scanner(System.in);
		System.out.println("ENter the number");
		int n = scan.nextInt();
		while(true)
		{
		        n++;
		        int temp=n;
		        int sum= 0;
		        while(temp!=0)
		        {
		            int fact=1;
		            int ld = temp%10;
		            for(int a=1;a<=ld;a++)
		            {
		                fact=fact*a;
		            }
		            sum=sum+fact;
		            temp=temp/10;
		        }
		        if(sum==n)
		        {
		            System.out.println("The next strong number is : "+n);
		            break;
		        }
		        
		}
	}
}
