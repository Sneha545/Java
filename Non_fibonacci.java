/*Non fibonacci series
fibonacci-0,1,1,2,3,5,8,13....
Non-fibonacci-4,6,7,9,10.......
*/
public class Non_fibonacci
{
	public static void main(String[] args) 
	{
	    int a=0;
	    int b=1;
	    int sum=0;
	    for(int i=0;i<=10;i++)
	    {
	        if(sum!=i)
	        {
	           System.out.println(i); 
	        }
	        else
	        {
	            sum=a+b;
	            a=b;
	            b=sum;
	        }
	    }
		
	}
}
