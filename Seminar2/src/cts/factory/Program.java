package cts.factory;

public class Program {
	public static void main(String[] args) {
		
		MijlocTransportComun mijloc1 = Factory.creareMijlocTransport(TipMijlocTransport.Autobuz, "B100MSM");
		MijlocTransportComun mijloc2 = Factory.creareMijlocTransport(TipMijlocTransport.Troleibuz, "B103MSM");
		MijlocTransportComun mijloc3 = Factory.creareMijlocTransport(TipMijlocTransport.Tramvai, "B500MSM");
		
		System.out.println(mijloc1);
		System.out.println(mijloc2);
		System.out.println(mijloc3);
	}
}
