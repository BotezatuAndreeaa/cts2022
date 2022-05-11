package ex1.clase;

public class BiletBusiness extends Bilet {

	public BiletBusiness(String aeroportPlecare, String aeroportDestinatie, float pret) {
		super(aeroportPlecare, aeroportDestinatie, pret);
		
	}

	@Override
	public String toString() {
		
		return "BiletBusiness[Plecare:"+aeroportPlecare+", Sosire:"+aeroportDestinatie+"Pret: "+pret+"]";
	}
	

}
