//program to print first n armstrong numbers
import java.util.Scanner;
public class firstnarmstrong
{
	public static void main(String[] args) 
	{
	    Scanner scan = new Scanner(System.in);
		System.out.println("ENter the number");
		int n = scan.nextInt();
        int sln=1;
        for(int i=1;sln<=n;i++)
        {
            int count =0;
            int temp = i;
            while(temp!=0)
            {
                count++;
                temp=temp/10;
            }
            temp=i;
            int sum=0;
            while(temp!=0)
            {
                int ld = temp%10;
                int exp=1;
                for(int a =1;a<=count;a++)
                {
                    exp=exp*ld;
                }
                sum=sum+exp;
                temp=temp/10;
            }
            if(sum==i)
            {
                System.out.println(sln+")"+i);
                sln++;
            }
            
        }
	}
