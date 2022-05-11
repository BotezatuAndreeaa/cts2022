package ex1.clase;

public class FactoryBiletBusiness implements Factory {

	@Override
	public Bilet creareBilet(String aeroportPlecare, String aeroportDestinatie, float pret) {
		
		return new BiletBusiness(aeroportPlecare, aeroportDestinatie, pret);
	}

}
