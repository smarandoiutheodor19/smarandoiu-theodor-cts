package main;

import chainOfResponsability_clase.*;

public class Program {
    public static void main(String[] args) {
        AutobuzHandler autobuzHandler = new AutobuzHandler(5,null);
        TroleibuzHandler troleibuzHandler = new TroleibuzHandler(3);
        TramvaiHandler tramvaiHandler = new TramvaiHandler(10);
        MetrouHandler metrouHandler = new MetrouHandler();

        troleibuzHandler.setNextHandler(autobuzHandler);
        autobuzHandler.setNextHandler(tramvaiHandler);
        tramvaiHandler.setNextHandler(metrouHandler);

        troleibuzHandler.afiseazaCuCeSaMearga(4);
        troleibuzHandler.afiseazaCuCeSaMearga(2);
        troleibuzHandler.afiseazaCuCeSaMearga(7);
        troleibuzHandler.afiseazaCuCeSaMearga(12);

        Handler autobuzHCluj = new AutobuzHandler(3000, null);
        Handler tramvaiHCluj = new TramvaiHandler(8);
        Handler troleibuzHCluj = new TroleibuzHandler(3);

        troleibuzHCluj.setNextHandler(tramvaiHCluj);
        tramvaiHCluj.setNextHandler(autobuzHCluj);
    }
}
