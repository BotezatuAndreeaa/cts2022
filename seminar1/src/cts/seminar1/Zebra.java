package cts.seminar1;

public class Zebra extends Animal {

	public Zebra(String nume) {
		super(nume);
	}
	
	@Override
	void mananca(String hrana) {
		System.out.println("Zebra"+getNume()+" a mancat"+ hrana);
	}
	

}
