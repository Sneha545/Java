/*Program to print pattern
  5 4 3 2 1
1 * * * * *
2 * * * * 
3 * * * 
4 * * 
5 *
4th quadrant no need of space that is else part and rev j values
i   j
1 < 5
1 < 4
1 < 3 
1 < 2
1 = 1
2 < 5
2 < 4
2 < 3
2 = 2
3 < 5
3 < 4
3 = 3
4 < 5
4 = 4
5 = 5
i<=j
*/
public class Pattern16
{
	public static void main(String[] args) 
	{
	    for(int i=1;i<=5;i++)
	    {
	        for(int j=5;j>=1;j--)
	        {
	            if(i<=j)
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
