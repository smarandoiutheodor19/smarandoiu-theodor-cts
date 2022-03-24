package cts.factory.method;

public class Main {
	public static void modulAfisareMijlocTransport(Factory fabrica, String nrInmatriculare) {
		MijlocTransportComun mijloc = new MijlocTransportComun(nrInmatriculare);
	}
	
	public static void main(String[] args) {
		Factory factory = new FactoryAutobuz();
		System.out.println(factory.creareMijloc("B999MSM"));
	}
}
