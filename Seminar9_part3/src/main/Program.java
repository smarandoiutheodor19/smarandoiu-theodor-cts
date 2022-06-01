package main;

import command_clase.Autobuz;
import command_clase.Comanda;
import command_clase.ManagerComenzi;
import command_clase.PleacaInCursa;

public class Program {
    public static void main(String[] args) {
        Autobuz a1 = new Autobuz("autobuz1");
        Autobuz a2 = new Autobuz("autobuz2");
        Autobuz a3 = new Autobuz("autobuz3");

        Comanda c1 = new PleacaInCursa(a1, 331);
        ManagerComenzi managerComenzi = new ManagerComenzi();
        managerComenzi.invoca(c1);
        managerComenzi.invoca(new PleacaInCursa(a2, 341));
        managerComenzi.invoca(new PleacaInCursa(a3, 351));
        managerComenzi.invoca(new PleacaInCursa(a1, 401));
        managerComenzi.invoca(new PleacaInCursa(a2, 452));
        managerComenzi.invoca(new PleacaInCursa(a3, 435));

        managerComenzi.executaComanda();
        managerComenzi.executaComanda();
        managerComenzi.executaComanda();
        managerComenzi.executaComanda();
        managerComenzi.executaComanda();
        managerComenzi.executaComanda();
        managerComenzi.executaComanda();
    }
}
