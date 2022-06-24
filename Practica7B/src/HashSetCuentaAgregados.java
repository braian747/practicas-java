import java.util.Collection;
import java.util.HashSet;

@SuppressWarnings("serial")
public class HashSetCuentaAgregados<E> extends HashSet<E> {
		private int cantidadAgregados = 0;
		public HashSetCuentaAgregados() {
		}
		public HashSetCuentaAgregados(int initCap, float loadFactor){
		super(initCap, loadFactor);
		}
		@Override
		public boolean add(E e) {
		cantidadAgregados++;
		return super.add(e);
		}
		public boolean addAll(Collection<? extends E> c) {
		return super.addAll(c);
		}
		public int getCantidadAgregados() {
		return cantidadAgregados;
		}
		}


