package cts.main;

import cts.clase.Autobuz;
import cts.clase.Comanda;
import cts.clase.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Autobuz autobuz=new Autobuz("AF445");
		Autobuz autobuz2=new Autobuz("AFEDH5");
		Autobuz autobuz3=new Autobuz("AFSYG445");
		Autobuz autobuz4=new Autobuz("AFHSDG445");
		
		Comanda comanda1=new ComandaPlecareTraseu(1, autobuz);
		Operator operator=new Operator();
		oparator.addComanda(new ComandaPlecareTraseu(2, autobuz2));
		
		operator.executaComanda();
		

	}

}
