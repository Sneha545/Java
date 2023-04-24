//program to print first n strong numbers
import java.util.Scanner;
public class //program to print first n strong numbers
import java.util.Scanner;
public class Strongnum1ton
{
	public static void main(String[] args) 
	{
	    Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = scan.nextInt();
		int sln=1;
		for(int i=1;sln<=n;i++)
		{
		    int sum=0;
		    int temp=i;
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
		    if(sum==i)
		    {
		         System.out.println(sln+")"+i);   
		         sln++;
		    }
		    
		}
	}
}

{
	public static void main(String[] args) 
	{
	    Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = scan.nextInt();
		int sln=1;
		for(int i=1;sln<=n;i++)
		{
		    int sum=0;
		    int temp=i;
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
		    if(sum==i)
		    {
		         System.out.println(sln+")"+i);   
		         sln++;
		    }
		    
		}
	}
}
