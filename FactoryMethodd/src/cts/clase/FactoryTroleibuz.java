package cts.clase;

public class FactoryTroleibuz implements Factory {

	@Override
	public MijlocTransportComun creareMijlocTransport(String nrInmatriculare) {
		return new Troleibuz(nrInmatriculare);
	}
}
