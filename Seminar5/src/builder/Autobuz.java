package builder;

public class Autobuz {
	private String model;
	private String numeSofer;
	private String nrInmatriculare;
	private Boolean stop;
	private Boolean openDoors;
	private String textEcran;
	private Integer nrLinie;
	private Boolean isNew;
	
	public Autobuz(String model, String numeSofer, String nrInmatriculare, Boolean stop, Boolean openDoors,
			String textEcran, Integer nrLinie, Boolean isNew) {
		super();
		this.model = model;
		this.numeSofer = numeSofer;
		this.nrInmatriculare = nrInmatriculare;
		this.stop = stop;
		this.openDoors = openDoors;
		this.textEcran = textEcran;
		this.nrLinie = nrLinie;
		this.isNew = isNew;
	}
	
	Autobuz() {
		model = "Mercedes";
		numeSofer = "Dorel";
		nrInmatriculare = "B555STB";
		stop = true;
		openDoors = true;
		textEcran = "Buna ziua";
		nrLinie = 555;
		isNew = true;
	}

	void setModel(String model) {
		this.model = model;
	}

	void setNumeSofer(String numeSofer) {
		this.numeSofer = numeSofer;
	}

	void setNrInmatriculare(String nrInmatriculare) {
		this.nrInmatriculare = nrInmatriculare;
	}

	void setStop(Boolean stop) {
		this.stop = stop;
	}

	void setOpenDoors(Boolean openDoors) {
		this.openDoors = openDoors;
	}

	void setTextEcran(String textEcran) {
		this.textEcran = textEcran;
	}

	void setNrLinie(Integer nrLinie) {
		this.nrLinie = nrLinie;
	}

	void setIsNew(Boolean isNew) {
		this.isNew = isNew;
	}

	@Override
	public String toString() {
		return "Autobuz [model=" + model + ", numeSofer=" + numeSofer + ", nrInmatriculare=" + nrInmatriculare
				+ ", stop=" + stop + ", openDoors=" + openDoors + ", textEcran=" + textEcran + ", nrLinie=" + nrLinie
				+ ", isNew=" + isNew + "]";
	}
	
	
	
}
