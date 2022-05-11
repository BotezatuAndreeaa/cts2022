package cts.clase;

import java.util.List;

public class Operator {
	private List<Comanda> comenzi;
	
	
	public Operator(List<Comanda> comenzi) {
		super();
		this.comenzi = comenzi;
	}

	public void addComanda(Comanda comanda) {
		comenzi.add(comanda);
		
	}
	
	public void executaComanda() {
		if(comenzi!=null && comenzi.size()>0) {
		comenzi.get(0).executa();
		comenzi.remove(0);
		
	 }
	}
	
}
