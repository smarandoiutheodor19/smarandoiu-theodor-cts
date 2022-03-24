package cts.singleton;

public class SoferAutobuz {
	
	private String nume;
	private static SoferAutobuz soferAutobuz = null;
	
	private SoferAutobuz(String nume) {
		this.nume = nume;
	}
	
	public static synchronized SoferAutobuz getInstance(String nume) {
		if(soferAutobuz == null) {
			soferAutobuz = new SoferAutobuz(nume);
		}
		return soferAutobuz;
	}
	
	public String getNume() {
		return nume;
	}
}
