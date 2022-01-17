
public class Generics<T> {

	// Eigenschaften / Attribute
	private T value;

	// Konstruktoren
	public Generics(T value) {
		this.setValue(value);
	}

	// Methoden
	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

}
