package cts.factory.method;

public class Tramvai extends MijlocTransportComun{
	public Tramvai(String nrInmatriculare) {
		super(nrInmatriculare);
	}
	
	@Override
	public String toString() {
		return "Tramvai " + nrInmatriculare;
	}
	
	
}
