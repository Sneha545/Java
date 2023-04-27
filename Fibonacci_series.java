/*Fibonacci Series
0,1,1,2,3,5,8,13,21......
0,1,0+1,1+1,1+2,2+3,3+5,5+8,8+13.......
*/

public class Fibonacci_series
{
	public static void main(String[] args) 
	{
	    int a=0;
	    int b=1;
	    int sum=0;
	    for(int i=1;i<=10;i++)//finonacci series up to 10th serial  number
	    {
	        System.out.println(sum);
	        a=b;
	        b=sum;
	        sum=a+b;
	    }
	}
}
