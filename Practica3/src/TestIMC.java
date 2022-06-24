import  java.util.Scanner;
public class TestIMC {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		double peso,altura;
		System.out.println("ingrese peso y altura");
		peso=sc.nextDouble();
		altura=sc.nextDouble();
		IMC imc= new IMC(peso,altura);// antes no compilaba por que no le pasabamos los parametros al constructor
		double res=imc.calculo(peso,altura);
		if(res<18){
			System.out.printf("%2.2f - Ud esta por debajo del IMC saludable",res);
		}
		else{
			if(res>25){
				System.out.printf("%2.2f - Ud esta por encima del IMC saludable",res);
				
			}
			else {
				System.out.printf("%2.2f - Ud. parece saludable!",res); // imprime dos enteros y dos decimales
		}
		
			
		}
		
		
		 //* (Double.parseDoublepeso,Double.parseDouble( args[1])); //transforma el string a double
		 //* G) es posible gracias a la sobrecarga(punto H), al ser diferentes parametros no hay drama colega
		}
	}
	
