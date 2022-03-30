package cts.clase;

public abstract class MijlocTransport implements Cloneable{

	private String numar;

	public String getDenumire() {
		return numar;
	}

	public void setDenumire(String denumire) {
		this.numar = denumire;
	}

	public MijlocTransport(String denumire) {
		super();
		this.numar = denumire;
	}
	
	public abstract MijlocTransport copiaza() throws CloneNotSupportedException;
}
