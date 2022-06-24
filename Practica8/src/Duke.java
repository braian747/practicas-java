import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class Duke  extends JFrame {
	private String imgFileName ;
	private int i;
	private Image img; 
	public Duke (){
	for(i=1; i<17;++i){
		imgFileName= "/imagenes/Duke_en_accion/t"+i+".gif";
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
	dibujar(i);
	}
	setTitle("Duke en accion");
	setSize(508, 580);
	setVisible(true);
	
	}

public void dibujar(int i) {
		this.getGraphics().drawImage(img, 0, 0, null);
	
}
@Override
public void paint(Graphics g) {
super.paintComponents(g);
dibujar(i);

}
}
