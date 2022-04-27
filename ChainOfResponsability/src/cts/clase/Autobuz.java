package cts.clase;

public class Autobuz extends TransportHandler{

	public Autobuz(int pragDist) {
		super(pragDist);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deplaseazaRequest(int dist) {
		if(dist<super.pragDist) {
			System.out.println("Se deplaseaza cu autobuzul");
			
		}else
			handler.deplaseazaRequest(dist);
	}

}
