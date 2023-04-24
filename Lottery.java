import java.util.Scanner;
public class Lottery
{
	public static void main(String[] args) 
  {
	   Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = scan.nextInt();
		if(n==77)
		{
		    System.out.println("You won");
		}
		else{
		     System.out.println("You lost");
		}
	}
}
