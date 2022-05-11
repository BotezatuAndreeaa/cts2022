package ex3.clase;

public class Calator implements Observer {
	
	private String nrBilet;
	boolean doarme;
	

	public Calator(String nrBilet, boolean doarme) {
		super();
		this.nrBilet = nrBilet;
		this.doarme = doarme;
	}


	@Override
	public void primesteInformareManevre(String mesaj) {
		System.out.println(nrBilet+" "+mesaj);
		
	}


	public boolean isDoarme() {
		return doarme;
	}
	
	
	
	

}
