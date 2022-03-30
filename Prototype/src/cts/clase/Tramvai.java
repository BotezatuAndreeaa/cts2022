package cts.clase;

public class Tramvai extends MijlocTransport {

	private String numeVatman;

	public String getNumeVatman() {
		return numeVatman;
	}

	public void setNumeVatman(String numeVatman) {
		this.numeVatman = numeVatman;
	}

	
	public Tramvai(String numar, String numeVatman) {
		super(numar);
		this.numeVatman = numeVatman;
	}

	@Override
	public String toString() {
		return "Tramvai [numeVatman=" + numeVatman + ", getDenumire()=" + getDenumire() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	@Override
	public MijlocTransport copiaza() throws CloneNotSupportedException {
		return (MijlocTransport)this.clone();
	}
	
}
