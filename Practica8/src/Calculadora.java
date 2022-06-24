import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculadora extends JFrame {
	private JButton b;
	private JMenuBar menu;
	private JTextField text;
	
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
		//texto 1
		text= new JTextField("20", 33);
		text.setEditable(false); 
		panel2.add(text);
		//texto 2
		text= new JTextField("M", 2);
		text.setEditable(false); 
		panel2.add(text);
		
		//botones de arriba, 
		b= new JButton("Retroceso");
		panel2.add(b);
		b= new JButton("CE");
		panel2.add(b);
		b= new JButton("C");
		panel2.add(b);
		panel2.setPreferredSize(new Dimension(300, 70));
		
		//PANEL CENTRAL(botones numericos y operandos)
		b= new JButton("0");
		panel.add(b);
		b= new JButton("1");
		panel.add(b);
		b= new JButton("2");
		panel.add(b);
		b= new JButton("3");
		panel.add(b);
		b= new JButton("4");
		panel.add(b);
		b= new JButton("5");
		panel.add(b);
		b= new JButton("6");
		panel.add(b);
		b= new JButton("7");
		panel.add(b);
		b= new JButton("8");
		panel.add(b);
		b= new JButton("9");
		panel.add(b);
		b= new JButton("+/-");
		panel.add(b);
		b= new JButton(",");
		panel.add(b);
		b= new JButton("+");
		panel.add(b);
		b= new JButton("=");
		panel.add(b);
		b= new JButton("-");
		panel.add(b);
		b= new JButton("*");
		panel.add(b);
		b= new JButton("/");
		panel.add(b);
		b= new JButton("%");
		panel.add(b);
		b= new JButton("1/x");
		panel.add(b);
		b= new JButton("sqrt");
		panel.add(b);
		
		//PANEL DE LA IZQUIERDA (botones "M")
		b= new JButton("M+");
		panel3.add(b);
		b= new JButton("MS");
		panel3.add(b);
		b= new JButton("MR");
		panel3.add(b);
		b= new JButton("MC");
		panel3.add(b);
		
		//configuraciones finales del frame
		setTitle("Calculadora");
		setSize(400, 500);
		setVisible(true); 
		setResizable(false);
	
	}
}
