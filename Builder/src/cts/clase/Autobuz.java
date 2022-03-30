package cts.clase;

public class Autobuz {
	
	private String model;
	private String numeSofer;
	private String numarInmatriculare;
	private Boolean stop;
	private Boolean openDoors;
	private String text;
	private Integer nrLinie;
	private Boolean isNew;

	
	public Autobuz(String model, String numeSofer, String numarInmatriculare, Boolean stop, Boolean openDoors,
			String text, Integer nrLinie, Boolean isNew) {
		super();
		this.model = model;
		this.numeSofer = numeSofer;
		this.numarInmatriculare = numarInmatriculare;
		this.stop = stop;
		this.openDoors = openDoors;
		this.text = text;
		this.nrLinie = nrLinie;
		this.isNew = isNew;
	}

	public Autobuz() {
		model ="Mercedes";
		numeSofer="Dorel";
		numarInmatriculare="B55STB";
		stop=true;
		openDoors=true;
		text="Buna ziua! :)";
		nrLinie=555;
		isNew=true;
	}

	void setModel(String model) {
		this.model = model;
	}
	
	void setNumeSofer(String numeSofer) {
		this.numeSofer = numeSofer;
	}
	
	void setNumarInmatriculare(String numarInmatriculare) {
		this.numarInmatriculare = numarInmatriculare;
	}
	
	void setStop(Boolean stop) {
		this.stop = stop;
	}
	
	void setOpenDoors(Boolean openDoors) {
		this.openDoors = openDoors;
	}
	
	 void setText(String text) {
		this.text = text;
	}
	
	void setNrLinie(Integer nrLinie) {
		this.nrLinie = nrLinie;
	}
	
	 void setIsNew(Boolean isNew) {
		this.isNew = isNew;
	}
	
	@Override
	public String toString() {
		return "Autobuz [model=" + model + ", numeSofer=" + numeSofer + ", numarInmatriculare=" + numarInmatriculare
				+ ", stop=" + stop + ", openDoors=" + openDoors + ", text=" + text + ", nrLinie=" + nrLinie + ", isNew="
				+ isNew + "]";
	}
	
	
	

}
