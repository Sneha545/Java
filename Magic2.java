import java.util.Scanner;
public class Magic2
{
	public static void main(String[] args) 
	{
	    Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = scan.nextInt();
		if(n%9==1)
		{
		    System.out.println("Magic number");
		}
		else
		{
		    System.out.println("Not a magic number");
		}
	}
}
