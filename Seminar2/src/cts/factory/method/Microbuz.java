package cts.factory.method;

public class Microbuz extends MijlocTransportComun{

	public Microbuz(String nrInmatriculare) {
		super(nrInmatriculare);
	}

	@Override
	public String toString() {
		return "Microbuz [nrInmatriculare=" + nrInmatriculare + "]";
	}
	

}
