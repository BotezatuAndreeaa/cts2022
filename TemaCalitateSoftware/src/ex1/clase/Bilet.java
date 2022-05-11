package ex1.clase;

public class Bilet {
	String aeroportPlecare;
	String aeroportDestinatie;
	float pret;
	public Bilet(String aeroportPlecare, String aeroportDestinatie, float pret) {
		super();
		this.aeroportPlecare = aeroportPlecare;
		this.aeroportDestinatie = aeroportDestinatie;
		this.pret = pret;
	}
	public String getAeroportPlecare() {
		return aeroportPlecare;
	}
	public String getAeroportSestinatie() {
		return aeroportDestinatie;
	}
	public float getPret() {
		return pret;
	}
	
	

}
