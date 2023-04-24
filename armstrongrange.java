//program to print armstrong number between given range
import java.util.Scanner;
public class armstrongrange
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
		    int count=0;
		    int temp=i;
		    while(temp!=0)
		    {
		        count++;
		        temp=temp/10;
		    }
		    temp=i;
		    int sum=0;
		    while(temp!=0)
		    {
		        int ld = temp%10;
		        int exp=1;
		        for(int a=1;a<=count;a++)
		        {
		            exp=exp*ld;
		        }
		        sum=sum+exp;
		        temp=temp/10;
		    }
		    if(sum==i)
		    {
		        System.out.println(sln+")"+i);
		        sln++;
		    }
		    
		}
	}
}
