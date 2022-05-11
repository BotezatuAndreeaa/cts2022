package ex3.clase;

public interface Subject {
	public void abonareObserver(Observer observer);
	public void dezabonareObserver(Observer observer);
	public void notify(String mesaj);

}
