package cts.clase;

public class Main {

	public static void main(String[] args) {
		
		Autobuz a1=new Autobuz("B10DRF", "Marcel");
		Tramvai t1=new Tramvai("B263533", "Dorel");
		
		try {
		MijlocTransport a2=a1.copiaza();
		MijlocTransport t2=t1.copiaza();
		
		
		System.out.println("Original - Autobuz" + a1);
		System.out.println("Original - Tramvai" + t1);
		
		System.out.println("Copie - Autobuz" + a2);
		System.out.println("Copie- Tramvai" + t2);
		
		
		}catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
	}

}
