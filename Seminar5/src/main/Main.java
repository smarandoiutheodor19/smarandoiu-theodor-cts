package main;

import builder.Autobuz;
import builder.AutobuzBuilder;
import builder.AutobuzBuilderV2;

public class Main {
	public static void main(String[] args) {
		Autobuz autobuz;
		Autobuz autobuz2;
		Autobuz autobuz3;
		AutobuzBuilder builder = new AutobuzBuilder();
		autobuz = builder.build();
		autobuz2 = new AutobuzBuilder().setNumeSofer("Vasile").build();
		autobuz3 = new AutobuzBuilder().setStop(false).setNrInmatriculare("B333ABC").build();
		
		System.out.println(autobuz);
		System.out.println(autobuz2);
		System.out.println(autobuz3);
		
		System.out.println(autobuz);
		
		AutobuzBuilderV2 autobuzBuilder = new AutobuzBuilderV2();
		Autobuz a1 = autobuzBuilder.setStop(true).setOpenDoors(true).setTextEcran("La multi ani").build();
		Autobuz a2 = autobuzBuilder.setNumeSofer("Ion").build();
		Autobuz a3 = autobuzBuilder.build();
		
		System.out.println("\nNoile autobuze");
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
	}
}
