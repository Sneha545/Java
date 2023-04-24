//program to print nth spy
import java.util.Scanner;
public class Nthspynum
{
	public static void main(String[] args) 
	{
	    Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = scan.nextInt();
		int sln=1;
		for(int i=1;sln<=n;i++)
		{
		    int temp=i;
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
		        if(sln==n)
		        {
		            System.out.println(sln+")"+i);
		        }
		        sln++;
		    }
		}
	}
}
