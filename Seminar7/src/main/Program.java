package main;

import Factory.FlyweightFactory;
import clase.Autobuz;
import clase.Linie;

public class Program {
    public static void main(String[] args) {
        Autobuz autobuz1 = new Autobuz("A1", 1995, 40);
        Autobuz autobuz2 = new Autobuz("A2", 2008, 46);
        Autobuz autobuz3 = new Autobuz("A3", 2012, 62);
        Autobuz autobuz4 = new Autobuz("A4", 2016, 60);

        FlyweightFactory flyweightFactory = new FlyweightFactory();

        Linie linie1 = flyweightFactory.getLinie(168);
        Linie linie2 = flyweightFactory.getLinie(133);

        autobuz1.descriere(flyweightFactory.getLinie(168));
        autobuz2.descriere(linie1);
        autobuz3.descriere(linie2);
        autobuz4.descriere(linie2);
    }
}
