package prototype;

public abstract class MijlocTransport implements Cloneable{
	private String numar;
	
	public MijlocTransport(String numar) {
		super();
		this.numar = numar;
	}
	
	public String getNumar() {
		return numar;
	}

	public void setNumar(String numar) {
		this.numar = numar;
	}
	
	public abstract MijlocTransport copiaza() throws CloneNotSupportedException;
}
