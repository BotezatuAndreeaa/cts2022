package cts.clase;

public class Metrou extends TransportHandler{

	public Metrou(int pragDist) {
		super(pragDist);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deplaseazaRequest(int dist) {
		if(dist<super.pragDist) {
			System.out.println("Se deplaseaza cu metroul");
			
		}else
			handler.deplaseazaRequest(dist);
	}

}
