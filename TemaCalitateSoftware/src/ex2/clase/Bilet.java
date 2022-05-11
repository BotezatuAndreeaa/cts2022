package ex2.clase;

public class Bilet implements TipBilet {
	String aeroportPlecare;
	String aeroportDestinatie;
	float pret;
	
	public Bilet(String aeroportPlecare, String aeroportDestinatie, float pret) {
		super();
		this.aeroportPlecare = aeroportPlecare;
		this.aeroportDestinatie = aeroportDestinatie;
		this.pret = pret;
	}
	
	public void setPret(float pret) {
		this.pret = pret;
	}

	@Override
	public void anuleazaRezervare() {
		System.out.println("Rezervarea nu poate fi anulata. Pretul biletului este de "+pret+"lei.");
		
	}

	public float getPret() {
		return pret;
	}
	

}
