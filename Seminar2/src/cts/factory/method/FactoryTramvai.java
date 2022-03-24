package cts.factory.method;

public class FactoryTramvai implements Factory{
	
	public MijlocTransportComun creareMijloc(String nrInmatriculare) {
		return new Tramvai(nrInmatriculare);
	}
}
