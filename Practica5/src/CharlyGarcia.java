
public class CharlyGarcia {
	public static CharlyGarcia instancia=new CharlyGarcia();
	private CharlyGarcia(){
		
	}
	//desde el main no podes hacer new CharlyGarcia porque el constructor es privado, pero 
	//si se  puede hace CharlyGarcia.instancia para generar una instancia de la clase
public static CharlyGarcia getInstancia(){
	return CharlyGarcia.instancia;
}
}
