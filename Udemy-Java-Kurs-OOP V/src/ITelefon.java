
public interface ITelefon {
	
	// Eigenschaften / Attribute -> nur Konstanten 
	public static final String NETZANBIETER = "Telekom";
	
	// Methodensignaturen / Methodenköpfe
	public abstract void powerOn();
	public abstract boolean esKlingelt();
	public abstract boolean anrufen();

}
