package cts.factory;

public class Troleibuz extends MijlocTransportComun{
	public Troleibuz(String nrInmatriculare) {
		super(nrInmatriculare);
	}
	@Override
	public String toString() {
		return "Troleibuz " + nrInmatriculare;
	}
	
}
