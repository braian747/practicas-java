import java.awt.*;

import java.io.IOException;

import javax.swing.*;
import java.net.URL;
import javax.imageio.ImageIO;
public class BuenosAires extends JFrame{
	private String imgFileName = "/imagenes/buenos-aires.jpg";
	private Image img; 

	public BuenosAires() {
		//Image im= new ImageIcon(getClass().getResource(imgFileName)).getImage();
		URL imgUrl = getClass().getResource(imgFileName);
		if (imgUrl == null) {
		System.err.println("No se encuentra el archivo:" + imgFileName);
		} else {
		try {
			img = ImageIO.read(imgUrl); // carga imagen en img
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		}
		setTitle("Mapa de buenos aires conectado");
		setSize(508, 580);
		setVisible(true);
		dibujar();
		}
	public void dibujar() {
		Graphics gr = img.getGraphics();
		gr.setColor(Color.RED);
		gr.setFont(new Font(Font.DIALOG, Font.BOLD,12 ));
		gr.drawString("Caballito", 250, 325);	
		gr.drawString("Puerto Madero", 415, 325);
		this.getGraphics().drawImage(img, 0, 0, null);
		gr.fillRect(250, 295, 250, 7);
		gr.setColor(Color.BLUE);
		gr.fillRect(480, 290, 20, 20); // DIBUJA UN CUADRADO !!!!!
		gr.fillRect(250, 290, 20, 20);
			
		
	}
	@Override
	public void paint(Graphics g) {
	//	super.paintComponents(g);
		dibujar();
	}


}
