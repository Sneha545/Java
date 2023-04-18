//Electronic store
import java.util.Scanner;
public class Electronicstore
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1 for mobiles");
		System.out.println("Enter 2 for laptops");
		System.out.println("Enter 3 for smart watches");
		System.out.println("Enter 4 for TV's");
		System.out.println("Enter 5 for AC");
		System.out.println("Enter your choice :");
		int n = scan.nextInt();
		if(n==1)
		{
		  System.out.println("Enter 1 for iphone");
		  System.out.println("Enter 2 for samsung");
		  System.out.println("Enter 3 for nokia");
		  System.out.println("Enter 4 for one plus");
		  System.out.println("Enter 5 for Mi");
		  System.out.println("Enter 6 for Real me");
		  System.out.println("Enter your choice :");
		  int n1 = scan.nextInt();
		  if(n1==1)
		  {
		      System.out.println("Availability:instock");
		      System.out.println("price :100000");
		  }
		  else if(n1==2)
		  {
		      System.out.println("Availability:instock");
		      System.out.println("price :80000");
		  }
		  else if(n1==3)
		  {
		      System.out.println("Availability:outofstock");
		      System.out.println("price :7000");
		  }
		  else if(n1==4)
		  {
		      System.out.println("Availability:instock");
		      System.out.println("price :50000");
		  }
		  else if(n1==5)
		  {
		      System.out.println("Availability:instock");
		      System.out.println("price :17000");
		  }
		  else if(n1==6)
		  {
		      System.out.println("Availability:outofstock");
		      System.out.println("price :20000");
		  }
		  else
		  {
		      System.out.println("Enter valid number");
		  }
		  
		 }
		else if(n==2)
		{
		  System.out.println("Enter 1 for HP");
		  System.out.println("Enter 2 for Dell");
		  System.out.println("Enter 3 for Acer");
		  System.out.println("Enter 4 for Lenovo");
		  System.out.println("Enter 5 for Asus");
		  System.out.println("Enter 6 for Mac");
		  System.out.println("Enter your choice :");
		  int n2 = scan.nextInt();
		  if(n2==1)
		  {
		      System.out.println("Availability:instock");
		      System.out.println("price :100000");
		  }
		  else if(n2==2)
		  {
		      System.out.println("Availability:instock");
		      System.out.println("price :80000");
		  }
		  else if(n2==3)
		  {
		      System.out.println("Availability:outofstock");
		      System.out.println("price :70000");
		  }
		  else if(n2==4)
		  {
		      System.out.println("Availability:instock");
		      System.out.println("price :50000");
		  }
		  else if(n2==5)
		  {
		      System.out.println("Availability:instock");
		      System.out.println("price :45000");
		  }
		  else if(n2==6)
		  {
		      System.out.println("Availability:outofstock");
		      System.out.println("price :150000");
		  }
		  else
		  {
		      System.out.println("Enter valid number");
		  }
		}
		else if(n==3)
		{
		  System.out.println("Enter 1 for i watch");
		  System.out.println("Enter 2 for fire bolt");
		  System.out.println("Enter 3 for Noise");
		  System.out.println("Enter 4 for Boat");
		  System.out.println("Enter 5 for Fossil");
		  System.out.println("Enter 6 for Fast track");
		  System.out.println("Enter your choice :");
		  int n3 = scan.nextInt();
		  if(n3==1)
		  {
		      System.out.println("Availability:instock");
		      System.out.println("price :50000");
		  }
		  else if(n3==2)
		  {
		      System.out.println("Availability:instock");
		      System.out.println("price :10000");
		  }
		  else if(n3==3)
		  {
		      System.out.println("Availability:outofstock");
		      System.out.println("price :7000");
		  }
		  else if(n3==4)
		  {
		      System.out.println("Availability:instock");
		      System.out.println("price :8000");
		  }
		  else if(n3==5)
		  {
		      System.out.println("Availability:instock");
		      System.out.println("price :45000");
		  }
		  else if(n3==6)
		  {
		      System.out.println("Availability:outofstock");
		      System.out.println("price :20000");
		  }
		  else
		  {
		      System.out.println("Enter valid number");
		  }
		}
		else if(n==4)
		{
		  System.out.println("Enter 1 for LG");
		  System.out.println("Enter 2 for Sony");
		  System.out.println("Enter 3 for Samsung");
		  System.out.println("Enter 4 for One plus");
		  System.out.println("Enter 5 for Mi");
		  System.out.println("Enter 6 for Panasonic");
		  System.out.println("Enter your choice :");
		  int n4 = scan.nextInt();
		  if(n4==1)
		  {
		      System.out.println("Availability:instock");
		      System.out.println("price :53000");
		  }
		  else if(n4==2)
		  {
		      System.out.println("Availability:instock");
		      System.out.println("price :20000");
		  }
		  else if(n4==3)
		  {
		      System.out.println("Availability:outofstock");
		      System.out.println("price :40000");
		  }
		  else if(n4==4)
		  {
		      System.out.println("Availability:instock");
		      System.out.println("price :50000");
		  }
		  else if(n4==5)
		  {
		      System.out.println("Availability:instock");
		      System.out.println("price :45000");
		  }
		  else if(n4==6)
		  {
		      System.out.println("Availability:outofstock");
		      System.out.println("price :15000");
		  }
		  else
		  {
		      System.out.println("Enter valid number");
		  }
		}
		else if(n==5)
		{
		  System.out.println("Enter 1 for LG");
		  System.out.println("Enter 2 for Bluestar");
		  System.out.println("Enter 3 for Onida");
		  System.out.println("Enter 4 for Whirpool");
		  System.out.println("Enter 5 for Voltas");
		  System.out.println("Enter 6 for Samsung");
		  System.out.println("Enter your choice :");
		  int n5 = scan.nextInt();
		  if(n5==1)
		  {
		      System.out.println("Availability:instock");
		      System.out.println("price :50000");
		  }
		  else if(n5==2)
		  {
		      System.out.println("Availability:instock");
		      System.out.println("price :30000");
		  }
		  else if(n5==3)
		  {
		      System.out.println("Availability:outofstock");
		      System.out.println("price :40000");
		  }
		  else if(n5==4)
		  {
		      System.out.println("Availability:instock");
		      System.out.println("price :50000");
		  }
		  else if(n5==5)
		  {
		      System.out.println("Availability:instock");
		      System.out.println("price :30000");
		  }
		  else if(n5==6)
		  {
		      System.out.println("Availability:outofstock");
		      System.out.println("price :48000");
		  }
		  else
		  {
		      System.out.println("Enter valid number");
		  }
		}
		
	}
}
