package cts.main;


import cts.clase.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TramvaiAbstract tramvai=new Tramvai();
		TramvaiAbstract tramvaiProbe=new TramvaiProbe();
		tramvai.parcurgereTraseu();
		tramvai.parcurgereTraseuInversa();
		tramvaiProbe.parcurgereTraseu();
		tramvaiProbe.parcurgereTraseuInversa();
		

	}

}
