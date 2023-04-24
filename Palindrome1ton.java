//program to print 1 to n palindromes
import java.util.Scanner;
public class Palindrome1ton
{
	public static void main(String[] args) {
		int sln=1;
		for(int i=1;sln<=100;i++)
		{
		    int temp=i;
		    int rev=0;
		    while(temp!=0)
		    {
		        int ld = temp%10;
		        rev = rev*10+ld;
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
