package cts.clase;

public class FactoryAutobuz implements Factory{

	@Override
	public MijlocTransportComun creareMijlocTransport(String nrInmatriculare) {
		return new Autobuz(nrInmatriculare);
	}
	

}
