package cts.clase;

public class Tramvai extends TransportHandler {

	public Tramvai(int pragDist) {
		super(pragDist);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deplaseazaRequest(int dist) {
		if(dist<super.pragDist) {
			System.out.println("Se deplaseaza cu tramvaiul");
			
		}else
			handler.deplaseazaRequest(dist);
	}
}
