package unlp.info.modelo;

public class  Persona implements Comparable<Persona>{
	String nombre;
	String apellido;
	int edad;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public  int compareTo(Persona p){
		if(this.apellido.compareTo(p.apellido)==0){
			if(this.nombre.compareTo(p.nombre)<0){
				return -1; //this es menor que p por el nombre
			}
			else return 1; //this es mayor que p por el nombre
		}
		else {
			if(this.apellido.compareTo(p.apellido)<0){
				return(-1);//this es menor que p
			}
		}
		 return 1;//this es mayor que p
	}
}
