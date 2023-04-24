//In a google company if experience >=5 and salary <=70000 bonus = 15% of salary 
import java.util.Scanner;
public class Google
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
		System.out.println("Enter the work experience:");
		int n1 = scan.nextInt();
		System.out.println("Enter the salary: ");
		int n2 = scan.nextInt();
		if(n1>=5&&n2<=70000)
		{
		    System.out.println("Congrats you won bonus:"+(n2*0.15));
		}
		else{
		    System.out.println("you will not get bonus");
		}
	}
}
