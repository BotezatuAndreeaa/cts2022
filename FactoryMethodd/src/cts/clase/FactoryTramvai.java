package cts.clase;

public class FactoryTramvai implements Factory{

	@Override
	public MijlocTransportComun creareMijlocTransport(String nrInmatriculare) {
		return new Tramvai(nrInmatriculare);
	}
	

}
