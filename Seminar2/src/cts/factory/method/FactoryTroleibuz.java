package cts.factory.method;

public class FactoryTroleibuz implements Factory{
	
	public MijlocTransportComun creareMijloc(String nrInmatriculare) {
		return new Troleibuz(nrInmatriculare);
	}
}
