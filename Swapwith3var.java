/*Program to swap 2 numbers with using 3rd variable
a=1
b=2
c=a -> c=1
a=b -> a=2
b=c -> b=1
*/
import java.util.Scanner;
public class Swapwith3var
{
	public static void main(String[] args) 
	{
	    Scanner scan = new Scanner(System.in);
		System.out.println("Enter a value : ");
		int a = scan.nextInt();
		System.out.println("Enter the b value : ");
		int b = scan.nextInt();
		int c;
		c=a;
		a=b;
		b=c;
		System.out.println("The value of a after swapping :"+a);
		System.out.println("The value of b after Swapping :"+b);
	}
}
