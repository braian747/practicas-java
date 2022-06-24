
	public class Hijo extends Padre {
		public Hijo() {
			super(8); //para poder crear un hijo, se tiene que poder completar el constructor del padre
			// tambien se puede crear un constructor vacio en padre y ahi no se produce problema
			System.out.println("Constructor Hijo()");
		}
	}