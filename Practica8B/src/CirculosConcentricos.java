
import java.awt.Color;
import java.awt.Graphics;
import java.util.Calendar;

import javax.swing.*;

public class CirculosConcentricos extends JFrame {
	Calendar today = Calendar.getInstance();

	public CirculosConcentricos() {
		getContentPane().setBackground(Color.BLACK);
		setTitle("Circulos concentricos");
		setSize(450, 500);
		setVisible(true);

	}

	public void dibujar(Graphics g) {
		Color[] c=new Color[] {Color.GREEN,Color.RED,Color.YELLOW,Color.CYAN,Color.BLUE};
		//version con rellleno
		int size = -20, endSize = 400;
		 for (int i = 50; i <= 400; i += 25) {//empieza por el circulo mas grande(en la pos (50,50+90))
	           if (size <= endSize) {
	              endSize -= 50;
	              g.setColor(c[(int) (Math.random()*5)]);
	              g.fillOval(i, i+90, endSize, endSize);
	              
	           }
		 }
		/*version sin relleno
		  g.setColor(Color.YELLOW);
        for (int i = 200; i >= 20; i -= 25) {//empieza por el circulo mas chico(en la pos (200,200+100))
           if (size <= endSize) {
              size += 50;
              g.drawOval(i, i+100, size, size);
           }       
}*/
		 g.setColor(Color.YELLOW);
        g.drawString("Hora actual",200,50);
        System.out.println(today.getTime());
//		g.setColor(Color.BLUE);	
//		g.fillOval(50, 50, 100, 100);
}

	@Override
	public void paint(Graphics g) {
		super.paintComponents(g);
		dibujar(g);

	}
}

