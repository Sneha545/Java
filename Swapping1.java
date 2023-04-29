/*Swapping 2 number without 3rd variable
a=1;
b=2;
a=a+b;1+2=3->a=3
b=a-b;3-2=1->b=1
a=a-b;3-1=2->a=2
*/

import java.util.Scanner;
public class Swapping1
{
	public static void main(String[] args) 
	{
	    Scanner scan = new Scanner(System.in);
		System.out.println("Enter the a value : ");
		int a = scan.nextInt();
		System.out.println("Enter the b value : ");
		int b = scan.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("The value of a after swapping is :" +a);
		System.out.println("The value of b after swapping is :" +b);
	}
}
