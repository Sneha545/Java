//program to print strong Number
/*strong num=sum of factorial of digits in a number should be equal to number
ex:145 = 1!+4!+5!=1+24+120=145*/
import java.util.Scanner;
public class Strongnum
{
	public static void main(String[] args) 
	{
	    Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = scan.nextInt();
		int sum=0;
		int temp=n;
		while(temp!=0)
		{
		    int fact=1;
		    int ld = temp%10;
		    for(int i=1;i<=ld;i++)
		    {
		        fact=fact*i;
		    }
		    sum=sum+fact;
		    temp=temp/10;
		}
		if(sum==n)
		{
		    System.out.println("Strong number");
		}
		else
		{
		    System.out.println("not a strong number");
		}
	}
}
