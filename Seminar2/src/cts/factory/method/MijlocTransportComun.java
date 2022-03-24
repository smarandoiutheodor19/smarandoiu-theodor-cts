package cts.factory.method;

public abstract class MijlocTransportComun {
	String nrInmatriculare;
	public MijlocTransportComun(String nrInmatriculare) {
		this.nrInmatriculare = nrInmatriculare;
	}
	
	@Override
	public String toString() {
		return "Mijloc " + nrInmatriculare;
	}
	
}
