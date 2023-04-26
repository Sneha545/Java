/*HCF-highest common factor
6-factors-1,2,3,6
4-factors-1,2,
both are having 1,2 has common factors but 2 is the highest common factor so hcf 0f 6,4 is 2*/
import java.util.Scanner;
public class HCF
{
	public static void main(String[] args) 
	{
	  Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int n1= scan.nextInt();
		System.out.println("Enter the 2nd number:");
		int n2 = scan.nextInt();
		int HCF=0;
		for(int i=1;i<=n1&&i<=n2;i++)
		{
		    if(n1%i==0 && n2%i==0)
		    {
		        HCF=i;
		    }
		}
		System.out.println(HCF);
	}
}
