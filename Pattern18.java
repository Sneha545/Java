/* program to print next prime number in Pattern
     * * * * * 
       * * * *
         * * *
           * * 
             *
             */
public class Pattern18
{
	public static void main(String[] args) 
	{
	    int x=7;
	    for(int i=1;i<=4;i++)
	    {
	        for(int j=1;j<=4;j++)
	        {
	            if(i<=j)
	            {
	                while(true)
	                {
	                    x++;
	                    int count=0;
	                    for(int a=1;a<=x;a++)
	                    {
	                        if(x%a==0)
	                        {
	                           count++; 
	                        }
	                    }
	                    if(count==2)
	                    {
	                        System.out.print(" "+x+" ");
	                        break;
	                    }
	                }
	            }
	            else
	            {
	                System.out.print("    ");//4
	            }
	        }
	        System.out.println();
	    }
	}
}
