/*2nd method is long division method
4)6(1
  4
 ---
  2)4(2
    4
   ---
    0
   ---
   HCF=2
  divisor=4
  divident=6
  rem=4
  steps:
  rem=divided%divisor
  dividend=divisor
  divisor=rem;
  */
import java.util.Scanner;
public class LongdivHCF
{
	public static void main(String[] args) 
	{
	    Scanner scan = new Scanner(System.in);
		System.out.println("Enter the 1st number:");
		int dd = scan.nextInt();
		System.out.println("Enter the 2nd number:");
		int ds= scan.nextInt();
		while(ds!=0)
		{
		    int rem=dd%ds;
		    dd=ds;
		    ds=rem;
		}
		System.out.println(dd);
	}
}
