package cts.singleton;

public class Program {
	public static void main(String[] args) {
		SoferAutobuz sofer1 = SoferAutobuz.getInstance("NumeRandom2");
		SoferAutobuz sofer2 = SoferAutobuz.getInstance("NumeRandom3");
		
		System.out.println(sofer1.getNume());
		System.out.println(sofer2.getNume());
	}
}
