package cts.factory.method;

public class FactoryAutobuz implements Factory{
	
	public MijlocTransportComun creareMijloc(String nrInmatriculare) {
		return new Autobuz(nrInmatriculare);
	}
}
