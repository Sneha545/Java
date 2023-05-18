/*Program to print pattern


   1   7   12   16   19   21
   2   8   13   17   20
   3   9   14   18
   4   10  15
   5   11
   6
   
   */
public class Pattern19
{
	public static void main(String[] args) 
	{
	    for(int i=1;i<=6;i++)
	    {
	        int x=i;
	        for(int j=6;j>=1;j--)
	        {
	            if(i<=j)
	            {
	                System.out.print(" "+x+" ");
	                x=x+j;
	            }
	        }
	        System.out.println();
	    }
	}
}
