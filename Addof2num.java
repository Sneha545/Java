//program to add given 2 numbers
/* not user defined
public class Main
{
	public static void main(String[] args) {
	    int a =10;
	    int b=20;
		System.out.println("The addition of aa and b is" +(a+b));
	}
}
*/
import java.util.Scanner;
public class Addof2num
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter first number");
	    int a = scan.nextInt();
	    System.out.println("Enter second number");
	    int b= scan.nextInt();
		System.out.println("The addition of a and b is :" +(a+b));
	}
}
