//program to print nth palindrome
import java.util.Scanner;
public class Nthpanlindrome
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = scan.nextInt();
		int sln=1;
		for(int i=1;sln<=n;i++)
		{
		    int rev=0;
		    int temp=i;
		    while(temp!=0)
		    {
		        int ld = temp%10;
		        rev=rev*10+ld;
		        temp=temp/10;
		    }
		    if(rev==n)
		    {
		        if(sln==n)
		        {
		        System.out.println(sln+")"+n);
		        }
		        sln++;
		    }
		    
		}
	}
}
