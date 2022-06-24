
/**
 * esta clase dibuja una pelota
 * @author pedro
 *
 */
public class BouncyBalls {

	/**
	 * metodo principal
	 * @param args bininiu
	 */
	public static void main(String[] args) {
		 // set the scale of the coordinate system
        StdDraw.setXscale(-1.0, 1.0);
        StdDraw.setYscale(-1.0, 1.0);

        // initial values
        double posicionX = 0.480, posicionY = 0.860;     // position
        double veloX = 0.015, veloY = 0.023;     // velocity
        double radius = 0.05;              // radius

        // main animation loop
        while (true)  { 

            // bounce off wall according to law of elastic collision
            if (Math.abs(posicionX + veloX) > 1.0 - radius) veloX = -veloX;
            if (Math.abs(posicionY + veloY) > 1.0 - radius) veloY = -veloY;

            // update position
            posicionX = posicionX + veloX; 
            posicionY = posicionY + veloY; 

            dibujaCirculo(posicionX, posicionY, radius); 
        } 		
	}
/**
 * metodo que realiza el dibujo
 * @param posicionX
 * @param posicionY
 * @param radius
 */
	public static void dibujaCirculo(double posicionX, double posicionY, double radius) {
		// clear the background
		StdDraw.clear(StdDraw.BLUE);

		// draw ball on the screen
		StdDraw.setPenColor(StdDraw.YELLOW); 
		StdDraw.filledCircle(posicionX, posicionY, radius); 

		// display and pause for 20 ms
		StdDraw.show(50);
	}

}
