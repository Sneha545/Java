/*Program for swapping 2 numbers without using 3rd variable method2
a=2;
b=3;
a=a*b;2*3=6->a=6
b=a/b;6/3=2->b=2
a=a/b;6/2=3->a=3
*/
import java.util.Scanner;
public class Swapping2
{
	public static void main(String[] args) 
	{
	    Scanner scan = new Scanner(System.in);
		System.out.println("ENter the a value : ");
		int a = scan.nextInt();
		System.out.println("Enter the b value : ");
		int b = scan.nextInt();
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("The value of a after swapping is :"+a);
		System.out.println("The value of b after swapping is :"+b);
	}
}
