//silver if bill>=20000 discount=12% if bill<20k discount=4%
//gold if bill>=500000 discount=10% else discount=5%
import java.util.Scanner;
public class GoldSilver
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1 for silver");
		System.out.println("Enter 2 for gold");
		System.out.println("Enter your choice:");
		int n = scan.nextInt();
		if(n==1)
		{
		    System.out.println("Enter the bill:");
		    int n1 = scan.nextInt();
		    if(n1>=20000)
		    {
		        System.out.println("The amount to be paid is:" +(n1*0.88));
		    }
		    else{
		        System.out.println("The amount to be paid is:" +(n1*0.96));
		    }
		}
		else
		{
		    System.out.println("Enter the bill:");
		    int n2 = scan.nextInt();
		    if(n2>=500000)
		    {
		        System.out.println("The amount to be paid is:" +(n2*0.90));
		    }
		    else{
		        System.out.println("The amounby to be paid is:" +(n2*0.95));
		    }
		}
		
	}
}
