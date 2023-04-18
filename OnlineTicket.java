//online ticket boooking
import java.util.Scanner;
public class OnlineTicket
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1 for airline");
		System.out.println("Enter 2 for train");
		System.out.println("Enter 3 for bus");
		System.out.println("Enter 4 for car");
		System.out.println("Enter 5 for bike");
		int n = scan.nextInt();
		if(n==1)
		{
		    System.out.println("Enter 1 for first class");
		    System.out.println("Enter 2 for second class");
		    System.out.println("Enter 3 for business class");
		    int p = scan.nextInt();
		    if(p==1)
		    {
		        System.out.println("Enter the number of tickets");
		        int p1 = scan.nextInt();
		        System.out.println("The amount to be paid is:"+(p1*100000));
		        System.out.println("Enter 1 to confirm");
		        System.out.println("Enter 2 for cancel");
		        int p2 = scan.nextInt();
		        if(p2==1)
		        {
		            System.out.println("your tickets are booked");
		        }
		        else
		        {
		            System.out.println("your tickets are cancelled");
		        }
		    }
		    else if(p==2)
		    {
		        System.out.println("Enter the number of tickets");
		        int p1 = scan.nextInt();
		        System.out.println("The amount to be paid is:"+(p1*9000));
		        System.out.println("Enter 1 to confirm");
		        System.out.println("Enter 1 for cancel");
		        int p2 = scan.nextInt();
		        if(p2==1)
		        {
		            System.out.println("your tickets are booked");
		        }
		        else
		        {
		            System.out.println("your tickets are cancelled");
		        }
		    }
		    else if(p==3)
		    {
		        System.out.println("Enter the number of tickets");
		        int p1 = scan.nextInt();
		        System.out.println("The amount to be paid is:"+(p1*5000));
		        System.out.println("Enter 1 to confirm");
		        System.out.println("Enter 1 for cancel");
		        int p2 = scan.nextInt();
		        if(p2==1)
		        {
		            System.out.println("your tickets are booked");
		        }
		        else
		        {
		            System.out.println("your tickets are cancelled");
		        }
		    }
		    
		}
		if(n==2)
		{
		    System.out.println("Enter 1 for AC class");
		    System.out.println("Enter 2 for non AC class");
		    int p = scan.nextInt();
		    if(p==1)
		    {
		        System.out.println("Enter the number of tickets");
		        int p1 = scan.nextInt();
		        System.out.println("The amount to be paid is:"+(p1*5000));
		        System.out.println("Enter 1 to confirm");
		        System.out.println("Enter 2 for cancel");
		        int p2 = scan.nextInt();
		        if(p2==1)
		        {
		            System.out.println("your tickets are booked");
		        }
		        else
		        {
		            System.out.println("your tickets are cancelled");
		        }
		    }
		    else if(p==2)
		    {
		        System.out.println("Enter the number of tickets");
		        int p1 = scan.nextInt();
		        System.out.println("The amount to be paid is:"+(p1*3000));
		        System.out.println("Enter 1 to confirm");
		        System.out.println("Enter 1 for cancel");
		        int p2 = scan.nextInt();
		        if(p2==1)
		        {
		            System.out.println("your tickets are booked");
		        }
		        else
		        {
		            System.out.println("your tickets are cancelled");
		        }
		    }
		    
		    
		}
		if(n==3)
		{
		    System.out.println("Enter 1 for Hired");
		    System.out.println("Enter 2 for govt transport");
		    int p = scan.nextInt();
		    if(p==1)
		    {
		        System.out.println("Enter the number of tickets");
		        int p1 = scan.nextInt();
		        System.out.println("The amount to be paid is:"+(p1*15000));
		        System.out.println("Enter 1 to confirm");
		        System.out.println("Enter 2 for cancel");
		        int p2 = scan.nextInt();
		        if(p2==1)
		        {
		            System.out.println("your tickets are booked");
		        }
		        else
		        {
		            System.out.println("your tickets are cancelled");
		        }
		    }
		    else if(p==2)
		    {
		        System.out.println("Enter the number of tickets");
		        int p1 = scan.nextInt();
		        System.out.println("The amount to be paid is:"+(p1*12000));
		        System.out.println("Enter 1 to confirm");
		        System.out.println("Enter 1 for cancel");
		        int p2 = scan.nextInt();
		        if(p2==1)
		        {
		            System.out.println("your tickets are booked");
		        }
		        else
		        {
		            System.out.println("your tickets are cancelled");
		        }
		    }
		    
		    
		}
		if(n==4)
		{
		    System.out.println("Enter 1 for XUV");
		    System.out.println("Enter 2 for SUV");
		    System.out.println("Enter 3 for min");
		    int p = scan.nextInt();
		    if(p==1)
		    {
		        System.out.println("Enter the number of tickets");
		        int p1 = scan.nextInt();
		        System.out.println("The amount to be paid is:"+(p1*30000));
		        System.out.println("Enter 1 to confirm");
		        System.out.println("Enter 2 for cancel");
		        int p2 = scan.nextInt();
		        if(p2==1)
		        {
		            System.out.println("your tickets are booked");
		        }
		        else
		        {
		            System.out.println("your tickets are cancelled");
		        }
		    }
		    else if(p==2)
		    {
		        System.out.println("Enter the number of tickets");
		        int p1 = scan.nextInt();
		        System.out.println("The amount to be paid is:"+(p1*20000));
		        System.out.println("Enter 1 to confirm");
		        System.out.println("Enter 1 for cancel");
		        int p2 = scan.nextInt();
		        if(p2==1)
		        {
		            System.out.println("your tickets are booked");
		        }
		        else
		        {
		            System.out.println("your tickets are cancelled");
		        }
		    }
		    else if(p==3)
		    {
		        System.out.println("Enter the number of tickets");
		        int p1 = scan.nextInt();
		        System.out.println("The amount to be paid is:"+(p1*24000));
		        System.out.println("Enter 1 to confirm");
		        System.out.println("Enter 1 for cancel");
		        int p2 = scan.nextInt();
		        if(p2==1)
		        {
		            System.out.println("your tickets are booked");
		        }
		        else
		        {
		            System.out.println("your tickets are cancelled");
		        }
		    }
		    
		}
		if(n==5)
		{
		    System.out.println("Enter 1 for 400CC and above");
		    System.out.println("Enter 2 for 200CC");
		    int p = scan.nextInt();
		    if(p==1)
		    {
		        System.out.println("Enter the number of tickets");
		        int p1 = scan.nextInt();
		        System.out.println("The amount to be paid is:"+(p1*5000));
		        System.out.println("Enter 1 to confirm");
		        System.out.println("Enter 2 for cancel");
		        int p2 = scan.nextInt();
		        if(p2==1)
		        {
		            System.out.println("your tickets are booked");
		        }
		        else
		        {
		            System.out.println("your tickets are cancelled");
		        }
		    }
		    else if(p==2)
		    {
		        System.out.println("Enter the number of tickets");
		        int p1 = scan.nextInt();
		        System.out.println("The amount to be paid is:"+(p1*4000));
		        System.out.println("Enter 1 to confirm");
		        System.out.println("Enter 1 for cancel");
		        int p2 = scan.nextInt();
		        if(p2==1)
		        {
		            System.out.println("your tickets are booked");
		        }
		        else
		        {
		            System.out.println("your tickets are cancelled");
		        }
		    }
		    
		    
		}
		
		
	}
}
