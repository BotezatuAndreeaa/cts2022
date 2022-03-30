package cts.main;

import cts.clase.Autobuz;
import cts.clase.AutobuzBuilder;
import cts.clase.AutobuzBuilderV2;

public class Main {

	public static void main(String[] args) {
		Autobuz autobuz;
		AutobuzBuilder builder= new AutobuzBuilder();
		autobuz=builder.build();
		
		Autobuz autobuz2;
		autobuz2= new AutobuzBuilder().setNumeSofer("Vasile").build();
	
		Autobuz autobuz3;
		autobuz3=new AutobuzBuilder().setStop(false).setNumarInmatriculare("B24GTT").build();
		
		System.out.println(autobuz);
		System.out.println(autobuz2);
		System.out.println(autobuz3);
		
		AutobuzBuilderV2 builder2=new AutobuzBuilderV2();
		
		Autobuz a1=builder2.setStop(true).setOpenDoors(true).setText("La multi ani!").build();
		Autobuz a2=builder2.setNumeSofer("Mihai").setNrLinie(666).build();
		
		System.out.println(a1);
		System.out.println(a2);
		
		
	}

}
