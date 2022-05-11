package ex1.main;
import ex1.clase.*;

public class Main {

	public static void main(String[] args) {
	Factory factory=new FactoryBiletEconomic();	
	Bilet b1=factory.creareBilet("Romania", "Italia", 200);
	System.out.println(b1.toString());
	
	Factory factory2=new FactoryBiletBusiness();
	Bilet b2=factory2.creareBilet("Romania", "Spania", 400);
	System.out.println(b2.toString());
	}
}
