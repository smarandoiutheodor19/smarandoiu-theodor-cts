package cts.seminar2;

import java.io.FileNotFoundException;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		List<cts.seminar2.Aplicant> listaAngajati;
		cts.seminar2.Reader reader = new cts.seminar2.AngajatiReader("angajati.txt");
		try {
			listaAngajati = reader.readAplicanti("angajati.txt");
			for(Aplicant angajat:listaAngajati)
				System.out.println(angajat.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}