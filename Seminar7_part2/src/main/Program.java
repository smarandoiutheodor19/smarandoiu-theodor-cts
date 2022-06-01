package main;

import strategy_clase.SMS;
import strategy_clase.Validator;

public class Program {
    public static void main(String[] args) {
        Validator validator = new Validator(3);
        validator.valideazaCalatorie();

        validator.setModPlata(new SMS());
        validator.valideazaCalatorie();
    }
}
