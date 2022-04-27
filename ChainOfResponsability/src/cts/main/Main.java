package cts.main;

import cts.clase.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TransportHandler troleibuz=new Troleibuz(3);
		TransportHandler autobuz=new Autobuz(5);
		TransportHandler tramvai =new Tramvai(10);
		TransportHandler metrou =new Metrou(1000);
		troleibuz.setHandler(autobuz);
		autobuz.setHandler(tramvai);
		tramvai.setHandler(metrou);
		int dist=9;
		troleibuz.deplaseazaRequest(dist);
}
}
