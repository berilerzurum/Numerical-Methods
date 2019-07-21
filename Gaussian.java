import java.util.Scanner;
import java.lang.Math;


public class Gaussian {

	public static double derivfonk(double x)
	{
		return  (Math.sin(x)-x*Math.cos(x)); // Math.exp(x); // (1/4.0*Math.pow(x,4)-4/3.0*Math.pow(x,3));
	}
	public static double fonk(double x)
	{
		return  (x*Math.sin(x));// Math.exp(x) // (Math.pow(x,3))-(4*Math.pow(x,2));
	}
	
	
	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
		

		System.out.println("enter an number for starting point of integral");
		double a = input.nextDouble();
		System.out.println("enter an number for end point of integral");
		double b = input.nextDouble();
	
		
		System.out.println("enter an integer for tolerans ((pow(10,x))  x=?? (x must be negative!!)");
		int w = input.nextInt();
		
		double m=0,t=0,res1=0,exactres=0,err=0,res2=0,sum=0,res3=0,res4=0,res5=0,res6=0,res7=0;
		System.out.println("choose n from set {2,3,4,5,6,7}");
		int r = input.nextInt();
		
		switch (r) {
		
		case 2:
			
			exactres=derivfonk(b)-derivfonk(a);
			System.out.println("exact result is "+exactres);	
			m=(b-a)/2;//u nun katsayýsý
			t=(a+b)/2;
			res1=(fonk(m*-(Math.sqrt(1/3.0))+t)+fonk(m*(Math.sqrt(1/3.0))+t))*m;
			System.out.println("result is "+res1);
			err=Math.abs(exactres-res1);
			System.out.println("Error is  "+err);	

			break;
	
		case 3:	
			
			exactres=derivfonk(b)-derivfonk(a);
			System.out.println("exact result is "+exactres);
			m=(b-a)/2;//u nun katsayýsý
			t=(a+b)/2;
			res1=((5/9.0)*fonk(m*(-(Math.sqrt(3/5.0))+t))+(8/9.0)*(fonk(m*0+t))+(5/9.0)*(fonk(m*Math.sqrt(3/5.0)+t)))*m;
			System.out.println("result is "+res1);
			err=Math.abs(exactres-res1);
			System.out.println("Error is  "+err);
			break;
		
		case 4:

			exactres=derivfonk(b)-derivfonk(a);
			System.out.println("exact result is "+exactres);
			m=(b-a)/2;//u nun katsayýsý
			t=(a+b)/2;
			res1=(fonk(m*-Math.sqrt(1/7.0*(3-4*Math.sqrt(0.3)))+t))*(1/2.0+(1/12.0*Math.sqrt(10/3.0)));
			res2=(fonk(m*-Math.sqrt(1/7.0*(3+4*Math.sqrt(0.3)))+t))*(1/2.0-(1/12.0*Math.sqrt(10/3.0)));
			res3=(fonk(m*Math.sqrt(1/7.0*(3-4*Math.sqrt(0.3)))+t))*(1/2.0+(1/12.0*Math.sqrt(10/3.0)));
			res4=(fonk(m*Math.sqrt(1/7.0*(3+4*Math.sqrt(0.3)))+t))*(1/2.0-(1/12.0*Math.sqrt(10/3.0)));
			sum=(res1+res2+res3+res4)*m;
			System.out.println("result is "+sum);
			err=Math.abs(exactres-sum);
			System.out.println("Error is  "+err);
			
			break;
			
			
		case 5:
			
			exactres=derivfonk(b)-derivfonk(a);
			System.out.println("exact result is "+exactres);
			m=(b-a)/2;//u nun katsayýsý
			t=(a+b)/2;
			res1=(fonk(m*-Math.sqrt(1/9.0*(5-2*Math.sqrt(10/7.0)))+t))*(0.3*((-0.7+5*Math.sqrt(0.7))/(-2+5*Math.sqrt(0.7))));
			res2=(fonk(m*-Math.sqrt(1/9.0*(5+2*Math.sqrt(10/7.0)))+t))*(0.3*((0.7+5*Math.sqrt(0.7))/(2+5*Math.sqrt(0.7))));
			res3=(fonk(m*0+t))*128/225.0;
			res4=(fonk(m*Math.sqrt(1/9.0*(5-2*Math.sqrt(10/7.0)))+t))*(0.3*((-0.7+5*Math.sqrt(0.7))/(-2+5*Math.sqrt(0.7))));
			res5=(fonk(m*Math.sqrt(1/9.0*(5+2*Math.sqrt(10/7.0)))+t))*(0.3*((0.7+5*Math.sqrt(0.7))/(2+5*Math.sqrt(0.7))));
			sum=(res1+res2+res3+res4+res5)*m;
			System.out.println("result is "+sum);
			err=Math.abs(exactres-sum);
			System.out.println("Error is  "+err);
	
			break;
			
		case 6:
			
			
			exactres=derivfonk(b)-derivfonk(a);
			System.out.println("exact result is "+exactres);
			m=(b-a)/2;//u nun katsayýsý
			t=(a+b)/2;
			res1=(fonk(m*0.6612093864662645+t))*0.3607615730481386;
			res2=(fonk(m*-0.6612093864662645+t))*0.3607615730481386;
			res3=(fonk(m*-0.2386191860831969+t))*0.4679139345726910;
			res4=(fonk(m*0.2386191860831969+t))*0.4679139345726910;
			res5=(fonk(m*-0.9324695142031521+t))*0.1713244923791704;
			res6=(fonk(m*0.9324695142031521+t))*0.1713244923791704;
			sum=(res1+res2+res3+res4+res5+res6)*m;
			System.out.println("result is "+sum);
			err=Math.abs(exactres-sum);
			System.out.println("Error is  "+err);
			
			break;
			
		case 7:
			
			
			exactres=derivfonk(b)-derivfonk(a);
			System.out.println("exact result is "+exactres);
			m=(b-a)/2;//u nun katsayýsý
			t=(a+b)/2;
			res1=(fonk(m*0.0000000000000000+t))*0.4179591836734694;
			res2=(fonk(m*0.4058451513773972+t))*0.3818300505051189;
			res3=(fonk(m*-0.4058451513773972+t))*0.3818300505051189;
			res4=(fonk(m*-0.7415311855993945+t))*0.2797053914892766;
			res5=(fonk(m*0.7415311855993945+t))*0.2797053914892766;
			res6=(fonk(m*-0.9491079123427585+t))*0.1294849661688697;
			res7=(fonk(m*0.9491079123427585+t))*0.1294849661688697;
			sum=(res1+res2+res3+res4+res5+res6+res7)*m;
			System.out.println("result is "+sum);
			err=Math.abs(exactres-sum);
			System.out.println("Error is  "+err);
			
			
			
			
			
			break;
			
			
		default:
			System.out.println("Hatali secim! ");
            break;
		
		
		// TODO Auto-generated method stub
		}
	}

}
