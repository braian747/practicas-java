
import java.awt.Graphics;
import javax.swing.*;

public class Grilla extends JFrame{
	
	public Grilla(){
		
		setTitle("Grilla dibujada");
		setSize(500, 500);
		setVisible(true);

		}
	public void dibujar(Graphics g) {
	for (int i=0;i<500;i=i+20) {
		g.drawLine(i, 0, i, 500);
	}
	for (int i=0;i<500;i=i+20) {
		g.drawLine(0, i, 500,i);
	}
	}
	
	
	@Override
	public void paint(Graphics g) {
	super.paintComponents(g);
	dibujar(g);

	}
}
