package cts.clase;

public class Autobuz {

	private String nrInmatriculare;

	public Autobuz(String nrInmatriculare) {
		super();
		this.nrInmatriculare = nrInmatriculare;
	}
	
	public void pleacaPeTraseu(int nrLinie) {
		System.out.println("Autobuzul cu numarul"+ nrInmatriculare+"a plecat pe linia"+ nrLinie);
	}
	
}
