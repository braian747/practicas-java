package unlp.info.math;

public class Complex {
	private double re;
	private double im;
	
	public Complex(double re, double im){
		this.im=im;
		this.re=re;
	}
	public final double realPart(){
		
		return re; 
	}
	public final double imaginaryPart(){
		return im;
 	}
	public final Complex add(Complex c){
		double re2,im2;
		im2=c.im+this.im;
		re2=c.re+this.re;
		Complex c2=new Complex(re2,im2);
		return c2;
	}
	public final Complex subtract(Complex c){
		double re2,im2;
		im2=c.im-this.im;
		re2=c.re-this.re;
		Complex c2=new Complex(re2,im2);
		return c2;
	}
	public final Complex multiply(Complex c){
		double re2,im2;
		im2=c.im*this.im;
		re2=c.re*this.re;
		Complex c2=new Complex(re2,im2);
		return c2;
	}
	public final Complex divide(Complex c){
		double re2,im2;
		im2=c.im/this.im;
		re2=c.re/this.re;
		Complex c2=new Complex(re2,im2);
		return c2;
	}
	
	public boolean equals (Object o) {
		boolean result= false;
		if((o!=null)&&(o instanceof Complex)){
 			Complex c=(Complex) o;//hace downcasting para trabajar con complex
 			if(( c.realPart()==this.realPart())&&(c.imaginaryPart()==this.imaginaryPart())){
 				result=true;
 			}
		}
		return result;
	}
	
	public int hashCode() {
		int result = 1;
		return result;
	}
	public final String toString(){
		return realPart() +" + "+imaginaryPart()+"i";
	}
	public static final Complex valueOf(double re, double im){
			Complex c= new Complex(re,im);
		return c;
	}
	
	
}
