/*Program to print pattern
  
  
   A B C D E
   F G H I
   J K L
   M N 
   O
   */
public class Pattern17
{
	public static void main(String[] args) 
	{
	    char ch ='A';
	    for(int i=1;i<=5;i++)
	    {
	        for(int j=5;j>=1;j--)
	        {
	            if(i<=j)
	            {
	               System.out.print(" "+ch+" ");
	               ch++;
	            }
	            else
	            {
	               System.out.print(" ");
	            }
	        }
	        System.out.println();
	    }
	}
}
