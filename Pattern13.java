/*Program to print pattern
  1 2 3 4 5 =j
1 *         =i
2 * *
3 * * *
4 * * * * 
5 * * * * *
first quadrant->no need of space that is else part
i   j
1 = 1
2 > 1
2 = 2
3 > 1
3 > 2
3 = 3
4 > 1
4 > 2
4 > 3
4 = 4
5 > 1
5 > 2
5 > 3
5 > 4
5 = 5
i>=j
*/

public class Pattern13
{
	public static void main(String[] args) 
	{
	    for(int i=1;i<=5;i++)
	    {
	        for(int j=1;j<=5;j++)
	        {
	            if(i>=j)
	            {
	                System.out.print(" * ");
	            }
	           /* else
	            {
	                System.out.print("   ");
	            } */
	        }
	        System.out.println();
	    }
	}
}
