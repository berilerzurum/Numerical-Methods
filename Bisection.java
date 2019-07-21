import java.util.Scanner;
import java.lang.Math; 
public class Bisection {

	public static double fonk(double x)
	{
		return  x * x * x - x * x + 2;//3-2*x-(Math.exp(-x)); ===other function example
	}


	@SuppressWarnings({ "resource" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer");
		
		double xo = input.nextDouble();
		System.out.println("enter an integer that greater than previous number");
		double xf = input.nextDouble();

		int n = 0;
		double e = 1;
		System.out.println("enter an integer for tolerans ((pow(10,x))  x=?? (x must be negative!!)");
		int a = input.nextInt();
		double xc=0;
		double x_final=0;
		
		while (e > Math.pow(10,a)) {
			
		    if (fonk(xo)*fonk(xf) > 0)
		    {
		    	System.out.println("this interval has not root because intervals numbers have same sign.");
		    	break;
		    }
		    else 
		        xc = xo+(xf-xo)/2; // control point
		        
		        if (fonk(xc)*fonk(xf) > 0)
		            xf = xc;
		        else
		            xo = xc;
		  
		    n = n+1;
		 
		    e = Math.abs((xf-xo)/2);
		    }
		x_final = xc;
		
		System.out.print("root is : "+x_final);
		System.out.print("\n");
		System.out.print("error is : "+e);
		System.out.print("\n");
		System.out.println("iteration number is : "+n);

		}
	}

