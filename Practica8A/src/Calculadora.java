import java.awt.BorderLayout; 
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculadora extends JFrame  {
	private JButton b;
	private JTextField text1;
	private JTextField text2;
	//private ArrayList<Integer> nums=new ArrayList<Integer>();
	private String op=new String(); //indica el operador (+,-,*,/)
	private StringBuilder nums=new StringBuilder(); //almacena los digitos de cada operador(al presionar un operador se transforman a double, se almacenan en num1 y se borra el string
													// y cuando se presiona el = se transforman a double,  se almacenan en num2 y se borra el string )
	private double num1; //primer operando
	private double num2; //segundo operando
	Calculadora (){
		
		setLayout(new BorderLayout()); // esto seria el panel base que puede ser dividido en zonas
		
	//creo los tres paneles para las diferentes zonas
		JPanel panel = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		
	//cada panel va a tener su layout, por eso se los separa en zonas
		GridLayout grilla= new GridLayout(4,5); // panel con una grilla de 4*5 (f*c)
		GridLayout grilla2=new GridLayout(4,1); // panel con una grilla de 4*1 (f*c)
		FlowLayout sup=new FlowLayout(); //panel superior que contiene botones y dos barras de texto
		
	//a cada panel le asigno su respectivo layout y luego agrego cada panel al panel base en la zona correspondiente(con el add, que sin nada hace referencia al this)
		panel.setLayout(grilla); //
		add(panel,BorderLayout.CENTER);
		panel2.setLayout(sup);
		add(panel2,BorderLayout.NORTH);//panel para la barra de texto y los botones de arriba
		panel3.setLayout(grilla2);
		add(panel3,BorderLayout.WEST);
		
	//creo las instancias de cada elemento(botones, texto) con su valor correspondiente y luego los agrego a cada panel segun corresponda
		//PANEL SUPERIOR (texto y botones)
		panel2.setPreferredSize(new Dimension(300, 70));//le modifico el tama�o para que no se superponga con los otros paneles
		//texto 1
		text1= new JTextField("", 30);
		text1.setEditable(false); 
		panel2.add(text1);
		//texto 2
		text2= new JTextField("M", 2);
		text2.setEditable(false); 
		panel2.add(text2);
		
		//botones de arriba, 
		b= new JButton("Retroceso");
		panel2.add(b);
		b.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {							 
				
			}
		});
		b= new JButton("CE");
		panel2.add(b);
		b.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {							 
			}
		});
		b= new JButton("C");
		panel2.add(b);
		b.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {							 
				text1.setText(""); //se borra la barra de texto
				nums.delete(0, nums.length());//se borra el string de digitos
			}
		});
		
		
		//PANEL CENTRAL(botones numericos y operadores)
		b= new JButton("7");
		panel.add(b);
		b.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {//ESTO ES IGUAL PARA TODOS LOS BOTONES NUMERICOS
				nums.append("7"); //se agrega(concatena) el digito al string
				text1.setText(text1.getText()+"7"); //se visualizan los digitos en la barra de texto a medida que se van ingresando
			}
		});
		b= new JButton("8");
		panel.add(b);
		b.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {							 
				nums.append("8");;
				text1.setText(text1.getText()+"8");
			}
		});
		
		b= new JButton("9");
		panel.add(b);
		b.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {							 
				nums.append("9");
				text1.setText(text1.getText()+"9");
			}
		});
		b= new JButton("/");
		panel.add(b);
		b.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) { //	ESTO ES IGUAL PARA TODOS LOS BOTONES OPERADORES(+,-,*,/)		
				num1=Double.parseDouble(nums.toString()); //primero se transforma el StringBuilder a String y luego se transforma el String a double para almacenar el primer operando
				nums.delete(0, nums.length()); //se borra el String de digitos
				op="/";  					//se asigna el digito correspondiente al operador 
				text1.setText(text1.getText()+"/");//se visualiza el operador en la barra de texto, al igual que con los numeros
			}
		});
		b= new JButton("sqrt");
		panel.add(b);
		b.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {							 
				
			}
		});
		b= new JButton("4");
		panel.add(b);
		b.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {							 
				nums.append("4");
				text1.setText(text1.getText()+"4");
			}
		});
		b= new JButton("5");
		panel.add(b);
		b.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {							 
				nums.append("5");
				text1.setText(text1.getText()+"5");
			}
		});
		b= new JButton("6");
		panel.add(b);
		b.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {							 
				nums.append("6");
				text1.setText(text1.getText()+"6");
			}
		});
		b= new JButton("*");
		panel.add(b);
		b.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {		
				 num1=Double.parseDouble(nums.toString());
				 nums.delete(0, nums.length());
				op="*";
				text1.setText(text1.getText()+"*");
			}
		});
		b= new JButton("%");
		panel.add(b);
		b.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {							 
				
			}
		});
		b= new JButton("1");
		panel.add(b);
		b.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {							 
				nums.append("1");
				text1.setText(text1.getText()+"1");
			}
		});
		b= new JButton("2");
		panel.add(b);
		b.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {							 
				nums.append("2");
				text1.setText(text1.getText()+"2");
			}
		});
		b= new JButton("3");
		panel.add(b);
		b.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {							 
				nums.append("3");
				text1.setText(text1.getText()+"3");
			}
		});
		b= new JButton("-");
		panel.add(b);
		b.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {	
				 num1=Double.parseDouble(nums.toString());
				 nums.delete(0, nums.length());
				 op="-";
				 text1.setText(text1.getText()+"-");
			}
		});
		b= new JButton("1/x");
		panel.add(b);
		b.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {							 
				
			}
		});
		b= new JButton("0");
		panel.add(b);
		b.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {							 
				nums.append("0");
				text1.setText(text1.getText()+"0");
			}
		});
		b= new JButton("+/-");
		panel.add(b);
		b.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {							 
				
			}
		});
		b= new JButton(",");
		panel.add(b);
		b.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {							 
				
			}
		});
		b= new JButton("+");
		panel.add(b);
		b.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {	
				 num1=Double.parseDouble(nums.toString());
				 nums.delete(0, nums.length());
				op="+";
				text1.setText(text1.getText()+"+");
			}
		});
		b= new JButton("=");
		panel.add(b);
		b.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {	
				 num2=Double.parseDouble(nums.toString());//primero se transforma el StringBuilder a String y luego se transforma el String a double para almacenar el segundo operando
				switch (op) { //segun el operador elegido se invoca a la funcion correspondiente  y se muestra el resultado en la barra de texto
				case "+": text1.setText(sumar(num1,num2)+"");break;
				case "-": text1.setText(restar(num1,num2)+"");break;
				case "*": text1.setText(multiplicar(num1,num2)+"");break;
				case "/": text1.setText(dividir(num1,num2)+"");break;
				
				}
				nums.delete(0, nums.length()); //se borra el String de digitos
				text1.setText(text1.getText()+"                          PRESIONAR 'C'");//es solo para agregar el aviso, se puede sacar
			}
		});
		//PANEL DE LA IZQUIERDA (botones "M")
		b= new JButton("MC");
		panel3.add(b);
		b.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {	
			
			}
		});
		b= new JButton("MR");
		panel3.add(b);
		b.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {							 
				
			}
		});
		b= new JButton("MS");
		panel3.add(b);
		b.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {							 
				
			}
		});
		b= new JButton("M+");
		panel3.add(b);
		b.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {							 
				
			}
		});
		
		//configuraciones finales del frame
		setTitle("Calculadora");
		setSize(350, 400);
		setVisible(true); 
		setResizable(false);
	
	}
	public double sumar(double n1 ,double n2) {
		return n1+n2;
	}
	public double restar(double n1 ,double n2) {
		return n1-n2;
	}
	public double multiplicar(double n1 ,double n2) {
		return n1*n2;
	}
	public double dividir(double n1 ,double n2) {
		return n1/n2;
	}

}


