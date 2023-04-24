import java.util.Scanner;
public class Perfectnum
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = scan.nextInt();
		int temp=n;
		int sum=0;
		for(int i =1;i<=n/2;i++)
		{
		    if(n%i==0)
		    {
		        sum=sum+i;
		    }
		}
		if(sum==n)
		{
		   System.out.println("Perfect number"); 
		}
		else
		{
		    System.out.println("Not a perfect number");
		}
		
	}
}
