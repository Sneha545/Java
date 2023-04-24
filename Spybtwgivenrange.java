//program to print spy numbers between user defined range
import java.util.Scanner;
public class Spybtwgivenrange
{
	public static void main(String[] args) 
	{
	    Scanner scan = new Scanner(System.in);
		System.out.println("Enter the min number");
		int m = scan.nextInt();
		System.out.println("Enter the max number");
		int n = scan.nextInt();
		int sln=1;
		for(int i=m;i<=n;i++)
		{
		    int sum=0;
		    int prod=1;
		    int temp=i;
		    while(temp!=0)
		    {
		        int ld = temp%10;
		        sum=sum+ld;
		        prod=prod*ld;
		        temp=temp/10;
		   
		    }
		    
		    if(sum==prod)
		    {
		        System.out.println(sln+")"+i);
		        sln++;
		    }
		}
	}
}
