package cts.seminar2;

import java.util.Arrays;

public class Angajat extends Aplicant{
	private String ocupatie;
	private Integer salariu;
	
	public String getOcupatie() {
		return ocupatie;
	}
	public void setOcupatie(String ocupatie) {
		this.ocupatie = ocupatie;
	}
	public int getSalariu() {
		return salariu;
	}
	public void setSalariu(Integer salariu) {
		this.salariu = salariu;
	}
	public Angajat(String nume, String prenume, Integer varsta, Integer punctaj, Integer nrProiecte, String[] denumireProiecte,Integer salariu, String ocupatie) {
		super(nume,prenume,varsta,punctaj,nrProiecte,denumireProiecte);
		this.salariu = salariu;
		this.ocupatie = ocupatie;
	}
	public Angajat() {
		super();
		
	}
	
	@Override
	public String toString() {
		return "Angajat: " +  super.toString() + ", Ocupatie=" + ocupatie + ", Salariu=" + salariu;
	}
}
