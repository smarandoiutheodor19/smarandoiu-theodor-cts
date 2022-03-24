package cts.factory.method;

public class FactoryMicrobuz implements Factory{

	@Override
	public MijlocTransportComun creareMijloc(String nrInmatriculare) {
		return new Microbuz(nrInmatriculare);
	}

}
