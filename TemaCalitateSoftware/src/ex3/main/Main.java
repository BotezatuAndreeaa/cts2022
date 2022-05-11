package ex3.main;

import ex3.clase.*;

public class Main {

	public static void main(String[] args) {
	 Avion a1=new Avion(100);
	 Calator c1=new Calator("100M", false);
	 if(c1.isDoarme()==false) {
		 a1.abonareObserver(c1);
	 }
	 Calator c2=new Calator("101M", true);
	 if(c2.isDoarme()==false) {
		 a1.abonareObserver(c2);
	 }
	 Calator c3=new Calator("102M", true);
	 if(c3.isDoarme()==false) {
		 a1.abonareObserver(c3);
	 }
	 Calator c4=new Calator("103M", false);
	 if(c4.isDoarme()==false) {
		 a1.abonareObserver(c4);
	 }
	 Calator c5=new Calator("104M", true);
	 if(c5.isDoarme()==false) {
		 a1.abonareObserver(c5);
	 }
	 Calator c6=new Calator("105M", true);
	 if(c6.isDoarme()==false) {
		 a1.abonareObserver(c6);
	 }
	 
	 a1.incepeInformarea();
	 
	 
	 
	 
	 
	 

	}

}
