//area and volume calculator
import java.util.Scanner;
public class AreaandVolume
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    System.out.println("==============welcome to area and volume calculator==============");
		System.out.println("Enter 1 for area clculator");
		System.out.println("Enter 2 for volume calculator");
		int n = scan.nextInt();
		if(n==1)
		{
		    System.out.println("Enter 1 for area of circle");
		    System.out.println("Enter 2 for area of trianle");
		    System.out.println("Enter 3 for area of square");
		    System.out.println("Enter 4 for area of rectanle");
		    System.out.println("Enter 5 for area of parallelogram");
		    System.out.println("Enter 6 for area of rhombus");
		    int p = scan.nextInt();
		    if(p==1)
		    {
		        System.out.println("Enter the radius:");
		        double r = scan.nextDouble();
		        System.out.println("area of circle is :" +(3.14*r*r));
		    }
		    else if(p==2)
		    {
		        System.out.println("Enter the length:");
		        double l = scan.nextDouble();
		        System.out.println("Enter the breadth:");
		        double b = scan.nextDouble();
		        System.out.println("area of triangle is:" +(0.5*l*b));
		    }
		    else if(p==3)
		    {
		        System.out.println("Enter the side length:");
		        double s = scan.nextDouble();
		        System.out.println("area of square is is :" +(s*s));
		    }
		    else if(p==4)
		    {
		        System.out.println("Enter the length:");
		        double l = scan.nextDouble();
		        System.out.println("Enter the breadth:");
		        double b = scan.nextDouble();
		        System.out.println("area of rectangle is :" +(l*b));
		    }
		    else if(p==5)
		    {
		        System.out.println("Enter the length:");
		        double l = scan.nextDouble();
		        System.out.println("Enter the breadth:");
		        double b = scan.nextDouble();
		        System.out.println("area of parallelogram is :" +(l*b));
		    }
		    else if(p==6)
		    {
		        System.out.println("Enter the breadth:");
		        double b = scan.nextDouble();
		        System.out.println("Enter the height:");
		        double h = scan.nextDouble();
		        System.out.println("area of rhombus :" +(b*h));
		    }
		    else
		    {
		        System.out.println("Enter valid number");
		    }
		    
		    
		}
		else if(n==2)
		{
		    System.out.println("Enter 1 for volume of sphere");
		    System.out.println("Enter 2 for volume of pyramid");
		    System.out.println("Enter 3 for volume of cube");
		    System.out.println("Enter 4 for volume of cuboid");
		    System.out.println("Enter 5 for volume of cylinder");
		    System.out.println("Enter 6 for volume of cone");
		    int p = scan.nextInt();
		    if(p==1)
		    {
		        System.out.println("Enter the radius:");
		        double r = scan.nextDouble();
		        System.out.println("volume of sphere is :" +(4/3*3.14*r*r*r));
		    }
		    else if(p==2)
		    {
		        System.out.println("Enter the length:");
		        double l = scan.nextDouble();
		        System.out.println("Enter the breadth:");
		        double b = scan.nextDouble();
		        System.out.println("Enter the height:");
		        double h = scan.nextDouble();
		        System.out.println("volume of pyramid is:" +(1/3*l*b*h));
		    }
		    else if(p==3)
		    {
		        System.out.println("Enter the side length:");
		        double s = scan.nextDouble();
		        System.out.println("volume of cube is :" +(s*s*s));
		    }
		    else if(p==4)
		    {
		        System.out.println("Enter the length:");
		        double l = scan.nextDouble();
		        System.out.println("Enter the breadth:");
		        double b = scan.nextDouble();
		        System.out.println("Enter the height:");
		        double h = scan.nextDouble();
		        System.out.println("volume of cuboid is :" +(l*b*h));
		    }
		    else if(p==5)
		    {
		        System.out.println("Enter the radius:");
		        double r = scan.nextDouble();
		        System.out.println("Enter the height:");
		        double h = scan.nextDouble();
		        System.out.println("volume of cylinder is :" +(3.14*r*r*h));
		    }
		    else if(p==6)
		    {
		        System.out.println("Enter the radius:");
		        double r = scan.nextDouble();
		        System.out.println("Enter the height:");
		        double h = scan.nextDouble();
		        System.out.println("volume of cylinder is :" +(1/3*3.14*r*r*h));
		    }
		    else
		    {
		        System.out.println("Enter valid number");
		    }
		    
		    
		}
		else
		{
		    System.out.println("Enter valid number");
		}
	}
}
