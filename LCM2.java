/*
2,6
6*1=6
8,12
12*1=12
12*2=24
3,4
4*1=4
4*2=8
4*3=12
4,5
4 steps
(n1*i)%n2==0
*/
import java.util.Scanner;
public class LCM2
{
	public static void main(String[] args) 
	{
	    Scanner scan = new Scanner(System.in);
		System.out.println("Enter the 1st number");
		int n1 = scan.nextInt();
		System.out.println("Enter the 2nd number");
		int n2 = scan.nextInt();
		for(int i=1;true;i++)
		{
		    if((n1*i)%n2==0)
		    {
		        System.out.println(n1*i);
		        break;
		    }
		}
		
	}
}
