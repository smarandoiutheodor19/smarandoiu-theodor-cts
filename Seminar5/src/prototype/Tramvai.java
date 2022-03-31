package prototype;

public class Tramvai extends MijlocTransport {
	private String numeVatman;

	public Tramvai(String numar, String numeVatman) {
		super(numar);
		this.numeVatman = numeVatman;
	}

	public String getNumeVatman() {
		return numeVatman;
	}

	public void setNumeVatman(String numeVatman) {
		this.numeVatman = numeVatman;
	}

	@Override
	public MijlocTransport copiaza() throws CloneNotSupportedException {
		return (MijlocTransport) this.clone();
	}

	@Override
	public String toString() {
		return "Tramvai [numeVatman=" + numeVatman + ", getNumeVatman()=" + getNumeVatman();
	}
	
	
	
}
