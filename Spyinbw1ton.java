//program to print 1 to n in between prime numbers
import java.util.Scanner;
public class Spyinbw1ton
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scan.nextInt();
        for(int i=1;i<=n;i++)
        {
            int temp=i;
            int sum=0;
            int prod=1;
            while(temp!=0)
            {
                int ld = temp%10;
                sum=sum+ld;
                prod=prod*ld;
                temp=temp/10;
            }
            if(sum==prod)
            {
                System.out.println(i);
            }
        }
    }
}
