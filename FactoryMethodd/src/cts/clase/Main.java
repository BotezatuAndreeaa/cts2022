package cts.clase;

public class Main {
	
//	public static void modulAfisare(Factory factory, String nrInmatriculare) {
//		
//		
//	}

	public static void main(String[] args) {
	
		Factory factory= new FactoryAutobuz();
		MijlocTransportComun m1=factory.creareMijlocTransport("B34ATB");
		System.out.println(m1.toString());
		

	}

}
