package cts.seminar2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EleviReader extends AplicantReader {
    public EleviReader(String numeFisier) {
		super(numeFisier);
		// TODO Auto-generated constructor stub
	}

	@Override
    public List<Aplicant> readAplicanti(String file) throws FileNotFoundException {
		super.scanner.useDelimiter(",|\n");
        List<Aplicant> elevi = new ArrayList<>();

        while (super.scanner.hasNext()) {
            Elev elev = new Elev();
            int clasa = super.scanner.nextInt();
            String tutore = super.scanner.next();
            elev.setClasa(clasa);
            elev.setTutore(tutore);
            elevi.add(elev);
        }

        super.scanner.close();
        return elevi;
    }
}
