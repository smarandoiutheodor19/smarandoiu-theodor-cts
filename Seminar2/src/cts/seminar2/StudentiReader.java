package cts.seminar2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentiReader extends AplicantReader{
    public StudentiReader(String numeFisier) {
		super(numeFisier);
		// TODO Auto-generated constructor stub
	}

	@Override
    public List<Aplicant> readAplicanti(String file) throws FileNotFoundException {
		super.scanner.useDelimiter(",|\n");
        List<Aplicant> studenti = new ArrayList<Aplicant>();

        while (super.scanner.hasNext()) {
            Student student = new Student();
            readAplicant(super.scanner, student);
            int anStudii = super.scanner.nextInt();
            String facultate = (super.scanner.next()).toString();
            student.setAnStudii(anStudii);
            student.setFacultate(facultate);
            studenti.add(student);
        }
        super.scanner.close();
        return studenti;
    }
}
