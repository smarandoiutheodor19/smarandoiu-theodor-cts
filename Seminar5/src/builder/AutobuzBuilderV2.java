package builder;

public class AutobuzBuilderV2 implements Builder {
	
	private String model;
	private String numeSofer;
	private String nrInmatriculare;
	private Boolean stop;
	private Boolean openDoors;
	private String textEcran;
	private Integer nrLinie;
	private Boolean isNew;
	
	public AutobuzBuilderV2() {
		model = "Mercedes";
		numeSofer = "Dorel";
		nrInmatriculare = "B555STB";
		stop = true;
		openDoors = true;
		textEcran = "Buna ziua";
		nrLinie = 555;
		isNew = true;
	}

	@Override
	public Autobuz build() {
		return new Autobuz(model, numeSofer, nrInmatriculare, stop, openDoors, textEcran, nrLinie, isNew);
	}

	public AutobuzBuilderV2 setModel(String model) {
		this.model = model;
		return this;
	}

	public AutobuzBuilderV2 setNumeSofer(String numeSofer) {
		this.numeSofer = numeSofer;
		return this;
	}

	public AutobuzBuilderV2 setNrInmatriculare(String nrInmatriculare) {
		this.nrInmatriculare = nrInmatriculare;
		return this;
	}

	public AutobuzBuilderV2 setStop(Boolean stop) {
		this.stop = stop;
		return this;
	}

	public AutobuzBuilderV2 setOpenDoors(Boolean openDoors) {
		this.openDoors = openDoors;
		return this;
	}

	public AutobuzBuilderV2 setTextEcran(String textEcran) {
		this.textEcran = textEcran;
		return this;
	}

	public AutobuzBuilderV2 setNrLinie(Integer nrLinie) {
		this.nrLinie = nrLinie;
		return this;
	}

	public AutobuzBuilderV2 setIsNew(Boolean isNew) {
		this.isNew = isNew;
		return this;
	}
	
	
}
