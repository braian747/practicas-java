import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DiccionarioDeSinonimos {

	private Map<String, String[]> diccionario = new HashMap<String,String[]>();
	public DiccionarioDeSinonimos(){
		diccionario.put("sillon",new String[] {"asiento", "silla" ,"butaca" });
		diccionario.put("casa",new String[] {"edificacion", "inmueble" ,"hogar", "obra" });
		diccionario.put("libro",new String[] {"ejemplar", "manual" ,"texto","obra" });
		diccionario.put("computador",new String[] {"equipo", "ordenador" ,"	pc" });
		
	}
	public void getSinonimos(String n){
		 
		for (String s : diccionario.get(n) ){
				System.out.println(s);
		}
		
	}
	public void imprimirClaves (){
		System.out.print(diccionario.keySet());
	}
	public String toString(){
		StringBuilder sb = new StringBuilder();
		for (Entry<String, String[]> entry : diccionario.entrySet()) {
			sb.append(entry.getKey());
			sb.append(entry.getValue());
		}
		return sb.toString();
	}
}
// agregar el for de arriba  y un /n para que salte en cada palabra