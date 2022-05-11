package ex1.clase;

public class FactoryBiletEconomic implements Factory{

	@Override
	public Bilet creareBilet(String aeroportPlecare, String aeroportDestinatie, float pret) {
		
		return new BiletEconomic(aeroportPlecare, aeroportDestinatie, pret);
	}

}
