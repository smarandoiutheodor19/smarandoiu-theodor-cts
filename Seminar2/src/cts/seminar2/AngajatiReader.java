package cts.seminar2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AngajatiReader extends AplicantReader {
	
	
    public AngajatiReader(String numeFisier) {
		super(numeFisier);
	}

	@Override
    public List<Aplicant> readAplicanti(String file) throws FileNotFoundException {
		super.scanner.useDelimiter(",");
        List<Aplicant> angajati = new ArrayList<>();

        while (super.scanner.hasNext()) {
            Angajat angajat = new Angajat();
            super.readAplicant(super.scanner, angajat);
            int salariu = super.scanner.nextInt();
            String ocupatie = super.scanner.next();
            angajat.setSalariu(salariu);
            angajat.setOcupatie(ocupatie);
            angajati.add(angajat);
        }
        super.scanner.close();
        return angajati;
    }
}
