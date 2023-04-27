/*Sum calculator*/
import java.util.Scanner;
public class Sumcalculator
{
	public static void main(String[] args) 
	{
	    Scanner scan = new Scanner(System.in);
	    int sum=0;
	    for(int i=1;true;i++)
	    {
	        int n = scan.nextInt();
	        char ch = scan.next().charAt(0);
	        if(ch=='+')
	        {
	            sum=sum+n;
	        }
	        else if(ch=='=')
	        {
	            sum=sum+n;
	            break;
	        }
	    }
	    System.out.println(sum);
	    
	}
}
