//Area of a triangle
import java.util.Scanner;
public class Areaoftriangle
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length:");
		int l = scan.nextInt();
		System.out.println("Enter the breadth:");
		int b = scan.nextInt();
		System.out.println("The area of triangle is :" +(0.5*l*b));
	}
}
