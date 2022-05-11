package ex2.clase;

public class BiletAnulare implements TipBilet {

	private TipBilet bilet;
	
	
	public BiletAnulare(TipBilet bilet) {
		super();
		this.bilet = bilet;
	}

	@Override
	public void anuleazaRezervare() {
		if(bilet.getPret()<100) {
			System.out.println("Rezervarea poate fi anulata!");
		}else {
			bilet.anuleazaRezervare();
		}
		
		
	}

	@Override
	public float getPret() {
		return bilet.getPret();
	}

}
