package main;

import template_clase.MijlocTransportPeSine;
import template_clase.Tramvai;

public class Program {
    public static void main(String[] args) {
        MijlocTransportPeSine tramvai = new Tramvai();
        tramvai.parcurgeTraseu();
        System.out.println("***************");
        tramvai.parcurgeTraseuInvers();
    }
}
