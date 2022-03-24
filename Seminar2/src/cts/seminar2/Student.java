package cts.seminar2;

import java.util.Arrays;

public class Student extends Aplicant {
	protected String facultate;
	protected int anStudii;
	
	
	public String getFacultate() {
		return facultate;
	}
	
	public void setFacultate(String facultate) {
		this.facultate = facultate;
	}
	
	public int getAnStudii() {
		return anStudii;
	}
	
	public void setAnStudii(int anStudii) {
		this.anStudii = anStudii;
	}

	public Student() {
		super();
	}
	

	@Override
	public String toString() {
		return "Student: " +  super.toString() + ", Facultate=" + facultate + ", AnStudii=" + anStudii;
	}
}
