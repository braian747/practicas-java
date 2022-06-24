
public class ParGenericoComparable<E extends Comparable<E>,T extends Comparable<T>>{

	private E v1;
	private T v2;
	ParGenericoComparable(E p1, T p2){
		this.v1=p1;
		this.v2=p2;
	}
}