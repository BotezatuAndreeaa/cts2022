package ex1.clase;

public class BiletEconomic extends Bilet {

	public BiletEconomic(String aeroportPlecare, String aeroportDestinatie,float pret) {
		super(aeroportPlecare, aeroportDestinatie, pret);
		
	}
	@Override
	public String toString() {
		
		return "BiletEconomic[Plecare:"+aeroportPlecare+", Sosire:"+aeroportDestinatie+"Pret: "+pret+"]";
	}

}
