package ex3.clase;

import java.util.HashSet;
import java.util.Set;

public class Avion implements Subject {

	private Set<Observer> observers;
	private Integer nrAvion;
	
	public Avion( Integer nrAvion) {
		observers=new HashSet<Observer>();
		this.nrAvion = nrAvion;
	}
	@Override
	public void abonareObserver(Observer observer) {
		observers.add(observer);
		
	}
	@Override
	public void dezabonareObserver(Observer observer) {
		observers.remove(observer);
		
	}
	@Override
	public void notify(String mesaj) {
		for(Observer observer: observers) {
			observer.primesteInformareManevre(mesaj);
		}
		
	}
	
	public void incepeInformarea() {
		notify("a fost informat in avionul cu nr "+nrAvion);
	}
	
	
	
	
}
