package ex2.main;
import ex2.clase.*;

public class Main {

	public static void main(String[] args) {
		TipBilet bilet=new Bilet("Romania", "Italia", 200);
		bilet.anuleazaRezervare();
		((Bilet)bilet).setPret(99);
		
		TipBilet biletAnulat=new BiletAnulare(bilet);
		
		biletAnulat.anuleazaRezervare();

	}

}
