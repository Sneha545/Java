/*program to print pattern
           *
          ***
         *****
        *******
       *********
        *******
         *****
          ***
           *
          */
public class Pattern34
{
	public static void main(String[] args) 
	{
	    int space=4;
	    int star=1;
	    for(int i=1;i<=9;i++)
	    {
	        for(int a=1;a<=space;a++)
	        {
	            System.out.print(" ");
	        }
	        for(int b=1;b<=star;b++)
	        {
	            System.out.print("*");
	        }
	        if(i<=4)
	        {
	            star=star+2;
	            space--;
	        }
	        else
	        {
	            star=star-2;
	            space++;
	        }
	        System.out.println();
	    }
	}
}
