package prototype;

public class Autobuz extends MijlocTransport{
	
	private String numeSofer;
	
	public Autobuz(String numar, String numeSofer) {
		super(numar);
		this.numeSofer = numeSofer;
	}

	public String getNumeSofer() {
		return numeSofer;
	}

	public void setNumeSofer(String numeSofer) {
		this.numeSofer = numeSofer;
	}

	@Override
	public MijlocTransport copiaza() throws CloneNotSupportedException {
		return null;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return (MijlocTransport) this.clone();
	}

	@Override
	public String toString() {
		return "Autobuz [numeSofer=" + numeSofer + ", getNumeSofer()=" + getNumeSofer();
	}
	
	
	
}
