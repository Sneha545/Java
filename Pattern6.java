/*Program to print pattern
*****
**@**
*****
*#***
*****
*/
public class Pattern6
{
	public static void main(String[] args) 
	{
	    for(int i=1;i<=5;i++)
	    {
	        for(int j=1;j<=5;j++)
	        {
	            if(i==2 && j==3)
	            {
	                System.out.print(" @ ");
	            }
	            else if(i==4 && j==2)
	            {
	                System.out.print(" # ");
	            }
	            else
	            {
	                System.out.print(" * ");
	            }
	        }
	        System.out.println();
	    }
	}
}