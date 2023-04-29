/*Program to print pattern
  5 4 3 2 1 
1         *
2       * *
3     * * *
4   * * * *
5 * * * * *
2nd quadrant rev j values
i   j
1 = 1
2 = 2
2 > 1
3 = 3
3 > 2
3 > 1
4 = 4 
4 > 3
4 > 2
4 > 1
5 = 5
5 > 4
5 > 3
5 > 2
5 > 1
i>=j
*/
public class Pattern14
{
	public static void main(String[] args) 
	{
	    for(int i=1;i<=5;i++)
	    {
	        for(int j=5;j>=1;j--)
	        {
	           if(i>=j)
	           {
	               System.out.print(" * ");
	           }
	           else
	           {
	               System.out.print("   ");
	           }
	        }
	        System.out.println();
	    }
	}
}
