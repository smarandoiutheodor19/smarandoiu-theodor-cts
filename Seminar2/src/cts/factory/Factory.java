package cts.factory;

public class Factory {
	public static MijlocTransportComun creareMijlocTransport(TipMijlocTransport tip, String nrInmatriculare) {
		switch(tip) {
		case Autobuz:
			return new Autobuz(nrInmatriculare);
		case Troleibuz:
			return new Troleibuz(nrInmatriculare);
		case Tramvai:
			return new Tramvai(nrInmatriculare);
		default:
			return null;
		}
	}
}
