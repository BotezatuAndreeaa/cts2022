package cts.clase;

public class FactoryMicrobuz implements Factory {

	@Override
	public MijlocTransportComun creareMijlocTransport(String nrInmatriculare) {
		return new Microbuz(nrInmatriculare);
	}

}
