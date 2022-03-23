package cts.clase;

public class Main {

	public static void main(String[] args) {
	
		MijlocTransportComun m1=Factory.creareMijlocTransport(TipMijlocTransport.Autobuz, "B20ATB");
		MijlocTransportComun m2=Factory.creareMijlocTransport(TipMijlocTransport.Troleibuz, "B20TLB");
		MijlocTransportComun m3=Factory.creareMijlocTransport(TipMijlocTransport.Tramvai, "B20TRM");
		
		System.out.println(m1.toString());
		System.out.println(m2.toString());
		System.out.println(m3.toString());
		

	}

}
