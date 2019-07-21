import java.util.Scanner;
import java.lang.Math; 
public class Newton {
	
	
	public static double fonk(double x)
	{
		return  3-2*x-(Math.exp(-x)); //x * x * x - x * x + 2; ===other function example
	}

	public static double deriv(double x)
	{
		return (Math.exp(-x))-2;//3 * x * x - 2 * x;====derivative of other function example 
		
	}
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
	

	System.out.println("enter an integer for x0");
	int c = input.nextInt();
	
	double x = c;
	int n = 0; // Iteration Number
	double e = 1;
	double x_next=0;
	
	System.out.println("enter an integer for tolerans ((pow(10,x))  x=?? (x must be negative!!)");
	int a = input.nextInt();
	
	while (e >Math.pow(10,a)) {
	    n = n+1;
	    x_next = x - fonk(x)/deriv(x);
	    e = Math.abs((x_next-x)/x_next)*100;
	    x = x_next;
	    if (n > 100)
	       break;
	}
	@SuppressWarnings("unused")
	double x_final = 0;
	x_final=x;

	System.out.print("root is : "+x_final);
	System.out.print("\n");
	System.out.print("error is : "+e);
	System.out.print("\n");
	System.out.println("iteration number is : "+n);
}

	
}