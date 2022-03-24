package cts.seminar2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public abstract class AplicantReader implements Reader{
	Scanner scanner;
	
	public AplicantReader(String numeFisier) {
		try {
			scanner = new Scanner(new File(numeFisier));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
    public void readAplicant(Scanner scanner, Aplicant aplicant){
        String nume = scanner.next();
        String prenume = scanner.next();
        int varsta = scanner.nextInt();
        int punctaj = scanner.nextInt();
        int nr = scanner.nextInt();
        String[] vect = new String[nr];
        for (int i = 0; i < nr; i++)
            vect[i] = scanner.next();
        aplicant.setNume(nume);
        aplicant.setPrenume(prenume);
        aplicant.setVarsta(varsta);
        aplicant.setPunctaj(punctaj);
        aplicant.setDenumireProiect(nr, vect);
    }
    
}
