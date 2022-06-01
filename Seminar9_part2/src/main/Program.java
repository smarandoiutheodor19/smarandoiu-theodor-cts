package main;

import state_clase.Autobuz;

public class Program {
    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz(100);
        autobuz.trimiteInService();
        autobuz.pleacaInCursa();
        autobuz.iesireDinService();
        autobuz.pleacaInCursa();
        autobuz.trimiteInService();
        autobuz.ajungeLaCapatDeLinie();
    }
}
