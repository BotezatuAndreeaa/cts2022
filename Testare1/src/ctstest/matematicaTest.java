package ctstest;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import cts.clase.Matematica;

public class matematicaTest {
	
	private Matematica mate;
	@Before
	public void setUp() {
		 mate=new Matematica();
	}

	
	@Test
	public void testSumaCorecta() {
	
		int rezultat=mate.suma(5, 9);
		assertEquals(14, rezultat);
	}
	
	@Test
	public void testRaportCorect() {

		double rezultat=mate.raport(24, 6);
		assertEquals(4.0, rezultat, 0.001);
	}
	
	@Test 
	public void testRaportShouldThrowException() {
		try {
			mate.raport(34, 0);
			fail("Nu trebuia sa ajunga aici!");
			
		}catch(IllegalArgumentException exceptie){
			
		}
		
	}
	
	@Test 
	public void testEsteParCorect() {
		assertTrue(mate.estePar(12));
	}
	
	@Test
	public void testNNumerePareisNotNull() {
		List<Integer> lista=mate.nNumerePare(2);
		assertNotNull(lista);
	}
}


