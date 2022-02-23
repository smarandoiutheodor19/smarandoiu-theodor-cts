package main;

import cts.seminar1.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        IngrijitorZOO ingr = new IngrijitorZOO("Vlad");
        Zoo z1 = new Zoo("Zoo1", ingr);
        Zebra zebra1 = new Zebra("zebra1");
        Zebra zebra2 = new Zebra("zebra2");
        Girafa girafa1 = new Girafa("girafa1");

        z1.addAnimal(zebra1);
        z1.addAnimal(zebra2);
        z1.addAnimal(girafa1);

        z1.hranesteAnimale("mancare");
    }
}
