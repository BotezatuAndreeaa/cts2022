package cts.main;

import cts.seminar1.Girafa;
import cts.seminar1.IngrijitorZoo;
import cts.seminar1.Zebra;
import cts.seminar1.Zoo;

public class Main {
	
	public static void main(String[] args) {
		IngrijitorZoo ingrijitorZoo=new IngrijitorZoo("ingrijitor");
		Zoo z1=new Zoo("Zoo1", ingrijitorZoo);
		Zebra zebra1=new Zebra("zebra1");
		Zebra zebra2=new Zebra("zebra2");
		Girafa girafa1=new Girafa("girafa1");
		
		z1.addAnimal(zebra1);
		z1.addAnimal(zebra2);
		z1.addAnimal(girafa1);	
		z1.hranesteAnimale("mancare");
		
	}

}
