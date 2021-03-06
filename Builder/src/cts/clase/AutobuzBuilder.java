package cts.clase;

public class AutobuzBuilder implements Builder{
	
	private Autobuz autobuz;
	
	public AutobuzBuilder() {
		autobuz=new Autobuz();	
		}

	@Override
	public Autobuz build() {
		return autobuz;
	}
	
	public AutobuzBuilder setModel(String model) {
		autobuz.setModel(model);
		return this;
	}
	
	public AutobuzBuilder setNumeSofer(String numeSofer) {
		autobuz.setNumeSofer(numeSofer);
		return this;
	}
	
	public AutobuzBuilder setNumarInmatriculare(String numarInmatriculare) {
		autobuz.setNumarInmatriculare(numarInmatriculare);
		return this;
	}
	
	public AutobuzBuilder setStop(Boolean stop) {
		autobuz.setStop(stop);
		return this;
	}
	
	public AutobuzBuilder setOpenDoors(Boolean openDoors) {
		autobuz.setOpenDoors(openDoors);
		return this;
	}
	
	public AutobuzBuilder setText(String text) {
		autobuz.setText(text);
		return this;
	}
	
	public AutobuzBuilder setNrLinie(Integer nrLinie) {
		autobuz.setNrLinie(nrLinie);
		return this;
	}
	
	public AutobuzBuilder setIsNew(Boolean isNew) {
		autobuz.setIsNew(isNew);
		return this;
	}
	

}
