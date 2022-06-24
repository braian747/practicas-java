import java.awt.*;
import javax.swing.*;

public class Dibujo {
	JLabel p = null;
	private static void createAndShowGUI() {
		JFrame frame = new JFrame("Dibujando............");
		JPanel panel= new JPanel();
		JLabel p = new JLabel("*");
		p.setLocation(10,10);
		panel.add(p);
		frame.add(panel);
		frame.setSize(500,500);
		frame.setVisible(true);
		}
	
	public static void main(String[] args) {
		Dibujo.createAndShowGUI();
		}

}