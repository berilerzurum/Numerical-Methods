import java.util.Scanner;
import java.lang.Math; 

public class RegulaFalsi {

	public static double fonk(double x)
	{
		return (x*(Math.sin(x)))-1; /*x * x * x - x * x + 2;//3-2*x-(Math.exp(-x)); ===other function example*/
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer for interval");
		
		double xo = input.nextDouble();
		System.out.println("Enter an integer for interval");
		double xf = input.nextDouble();
		
		int n = 0;
		double e = 1;
		System.out.println("enter an integer for tolerans ((pow(10,x))  x=?? (x must be negative!!)");
		int a = input.nextInt();
		double xc=0;
		double x_final=0;
		
		
		 if (fonk(xo)*fonk(xf) > 0)
		    {
		    	System.out.println("this interval has not root because intervals numbers have same sign.");
		    	return;
		    }
		  if(fonk(xf)<fonk(xo))
		    {
		    	double temp=0;
		    	temp=xf;
		    	xf=xo;
		    	xo=temp;
		    }

		    e=((Math.abs(xf-xo))/2);	
		
		while (e > Math.pow(10,a)) {
			n=n+1;
			xc=(xo*fonk(xf)-xf*fonk(xo))/(fonk(xf)-fonk(xo));
			if(fonk(xc)==0)
				x_final=xc;
			else if(fonk(xo)*fonk(xc)<0)
				xf=xc;
			else
				xo=xc;
			e=((Math.abs(xf-xo))/2);			
			if (n > 100)
			       break;
		   	}
		System.out.print("root is : "+x_final);
		System.out.print("\n");
		System.out.print("error is : "+e);
		System.out.print("\n");
		System.out.println("iteration number is : "+n);


	}
}
