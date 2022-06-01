package main;

import decorator_clase.Decorator;
import decorator_clase.DecoratorAbstract;
import decorator_clase.Iimprimanta;
import decorator_clase.ImprimantaDeBilete;

public class Program {
    public static void main(String[] args) {
        Iimprimanta iimprimanta = new ImprimantaDeBilete(5);
        iimprimanta.printeazaBilet();

        DecoratorAbstract decorator = new Decorator(iimprimanta, "Paste fericit!");
        decorator.printeazaBilet();
        decorator.printeazaVerso();
    }
}
