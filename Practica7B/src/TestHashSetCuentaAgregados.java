import java.util.ArrayList;
import java.util.List;

public class TestHashSetCuentaAgregados {

	public static void main(String[] args) {
		HashSetCuentaAgregados<Object> p=new HashSetCuentaAgregados<Object>();
		List<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(5);
		l.add(6);
		l.add(3);
		l.add(9);
		l.add(2);
		l.add(7);
		p.addAll(l);
		System.out.println(p.getCantidadAgregados());
		
		

	}

}
