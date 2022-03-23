package cts.clase;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SoferAutobuz sofer1=SoferAutobuz.getInstance("Matei");
		SoferAutobuz sofer2=SoferAutobuz.getInstance("Ion");
		
		System.out.println(sofer1.getNume());
		System.out.println(sofer2.getNume());

	}

}
