//Co primes
//if HCF of 2 number is equal to 1 then that numbers are called coprimes
import java.util.Scanner;
public class Coprimes
{
	public static void main(String[] args) 
	{
	    Scanner scan = new Scanner(System.in);
	    int a = scan.nextInt();
	    int b = scan.nextInt();
	    int hcf = 0;
	    for(int i=1;i<=a && i<=b;i++)
	    {
	        if(a%i==0 && b%i==0)
	        {
	            hcf=i;
	        }
	    }
	    if(hcf==1)
	    {
	       System.out.println("Co prime"); 
	    }
	    else
	    {
	        System.out.println("Not a coprime");
	    }
	}
}
