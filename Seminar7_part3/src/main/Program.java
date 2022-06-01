package main;

import observer_clase.Autobuz;
import observer_clase.Calator;
import observer_clase.Icalator;
import observer_clase.MijlocDeTransport;

public class Program {
    public static void main(String[] args) {
        MijlocDeTransport autobuz = new Autobuz(168);
        Icalator calator1 = new Calator("Popescu");
        Icalator calator2 = new Calator("Georgescu");
        Icalator calator3 = new Calator("Ionescu");

        autobuz.adaugaCalator(calator1);
        autobuz.adaugaCalator(calator2);

        autobuz.anuntaCalatori();

        autobuz.stergeCalator(calator2);
        autobuz.adaugaCalator(calator3);

        autobuz.anuntaCalatori();
    }
}
