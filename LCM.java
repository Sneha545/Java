/*
LCM-least common multiple
4-multiples-4,8,12,16,20,24,28..........
6-6,12,18,24,30..........
LCM of 4,6=12
*/
import java.util.Scanner;
public class LCM
{
	public static void main(String[] args) 
	{
	    Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number");
		int n1 = scan.nextInt();
		System.out.println("Enter the 2nd number");
		int n2 = scan.nextInt();
		for(int i=1;true;i++)
		{
		  if(i%n1==0 && i%n2==0)
		{
		   System.out.println(i);
		   break;
		}  
		}
	}
}
