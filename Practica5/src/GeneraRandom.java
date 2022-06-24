
import java.util.Random;

public final class GeneraRandom {
	static final int MAXIMO_VALOR = 10;

	public final int obtenerRandom(){
		Random r =new Random();
	
		return (r.nextInt(MAXIMO_VALOR+1));
	}
}
