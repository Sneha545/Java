//program to print palindrome between range
import java.util.Scanner;
public class Palindromebtrange
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
		System.out.println("Enter the min number");
		int m = scan.nextInt();
		System.out.println("Enter the max number");
		int n = scan.nextInt();
		int sln=1;
		for(int i=m;i<=n;i++)
		{
		    int rev=0;
		    int temp = i;
		    while(temp!=0)
		    {
		        int ld = temp%10;
		        rev=rev*10+ld;
		        temp=temp/10;
		    }
		    if(rev==i)
		    {
		        System.out.println(sln+")"+i);
		        sln++;
		    }
		}
		        
		    
	}
}
