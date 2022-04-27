package cts.clase;

public class Troleibuz extends TransportHandler{

	public Troleibuz(int pragDist) {
		super(pragDist);
		
	}

	@Override
	public void deplaseazaRequest(int dist) {
		if(dist<super.pragDist) {
			System.out.println("Se deplaseaza cu troleul");
			
		}else
			handler.deplaseazaRequest(dist);
	}
		
	}


