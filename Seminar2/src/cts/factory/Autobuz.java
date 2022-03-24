package cts.factory;

public class Autobuz extends MijlocTransportComun{
	public Autobuz(String nrInmatriculare) {
		super(nrInmatriculare);
	}
	
	@Override
	public String toString() {
		return "Autobuz " + nrInmatriculare;
	}
	
}
