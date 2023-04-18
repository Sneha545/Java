//odd numbers within a range
import java.util.Scanner;
public class Oddnum
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter the min range");
	    int n = scan.nextInt();
	    System.out.println("Enbter the max range");
	    int s = scan.nextInt();
	    for(int i=n;i<=s;i++)
	    {
	        if(i%2 != 0)
	        {
	            System.out.println(i);
	
	        }
	    }

	}
}
