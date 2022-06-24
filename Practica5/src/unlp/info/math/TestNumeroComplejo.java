package unlp.info.math;
import java.util.Scanner;
public class TestNumeroComplejo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=0;
		double re,im,re2,im2;
		while (i==0){
		System.out.println("ingrese la parte real y despues la imaginaria");
		re=sc.nextDouble();
		im=sc.nextDouble();
		Complex c1=new Complex(re,im);
		System.out.println("ingrese la parte real y despues la imaginaria");
		re2=sc.nextDouble();
		im2=sc.nextDouble();
		Complex c2=new Complex(re2,im2);
		System.out.println("la suma= " +c1.add(c2));
		System.out.println("la resta= "+c2.subtract(c1));
		}
		sc.close();
		}

}
