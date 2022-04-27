package cts.clase;

public abstract class TransportHandler {
	protected TransportHandler handler;
	
	protected int pragDist;
	
	public void setHandler(TransportHandler handler) {
		this.handler=handler;
	}
	
	public  abstract void deplaseazaRequest(int distanta);

	public TransportHandler(int pragDist) {
		this.handler=null;
	}
}
