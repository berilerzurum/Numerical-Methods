import java.util.Scanner;
import java.lang.Math; 

public class Boole {

	public static double fonk(double x)
	{
		return (x*Math.sin(x));
	}

	public static double derivfonk(double a,double b)
	{
		return (Math.sin(b)-b*Math.cos(b))-(Math.sin(a)-a*Math.cos(a));
	}

	public static void boole(double a,double b,double w)
	{
		double i,x=0,h=0,err=10,exactres=0;
		double s=0,result=0;
		exactres=derivfonk(a,b);

		int m=1,c=0;
		h=(b-a)/(4*m);
		
		if(h<(b-a)/1000)
			System.out.println("WARN!!!(h<(b-a)/1000)");
		
		System.out.println("Exact result is (for x*sin(x)) "+exactres);

		while(err>Math.pow(10,w))
		{			
				h=(b-a)/(4*m);
				s=0;
		for(i=0;i<=4*m;++i) 
		{
			x=a+(i*h);
			
				if(i==0||i==4*m)
					s=s+7*fonk(x);
				else if(i%2==1)
					s=s+32*fonk(x);				
				else if(i%4==0&&i!=4*m)
					s=s+14*fonk(x);
				else
					s=s+12*fonk(x);
		}
		++c;
		result=(2*h/45)*s;
		System.out.print(+c+".Step is "+result);
		System.out.print("\n");
		err=Math.abs(exactres-result);
		m=m+1;
		}
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("Best Boole's Result is "+result);
		System.out.print("\n");
		System.out.print("The smallest step size h used "+h);
		System.out.print("\n");
		System.out.print("Error is "+err);
	
	
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner input = new Scanner(System.in);
		

		System.out.println("enter an number for starting point of integral");
		double a = input.nextDouble();
		System.out.println("enter an number for end point of integral");
		double b = input.nextDouble();
	
		
		System.out.println("enter an integer for tolerans ((pow(10,x))  x=?? (x must be negative!!)");
		int w = input.nextInt();
		
		boole(a,b,w);

	}

}
