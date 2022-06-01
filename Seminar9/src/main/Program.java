package main;

import memento_clase.Autobuz;
import memento_clase.ManagerAutobuz;

public class Program {
    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz("autobuz1", "Andrei",20,1999);
        ManagerAutobuz managerAutobuz = new ManagerAutobuz();
        managerAutobuz.adaugareMemento(autobuz.creareMemento());

        autobuz.setNumeSofer("Gigel");
        managerAutobuz.adaugareMemento(autobuz.creareMemento());

        autobuz.setConsumMediu(15);
        managerAutobuz.adaugareMemento(autobuz.creareMemento());
        System.out.println(autobuz);

        autobuz.revenireStareAnterioara(managerAutobuz.getMementoAutobuz(0));
        System.out.println(autobuz);
    }
}
