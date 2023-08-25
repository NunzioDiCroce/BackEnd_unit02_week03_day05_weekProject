package com.example.GestioneIncendi;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class SondaTest {

	// primo test del metodo addOsservatore
	@Test
	public void testAddOsservatore() {
		Sonda sonda = new Sonda();
		Centrale centrale = new Centrale();

		sonda.addOsservatore(centrale);

		// verifica che la lista osservatori contenga la centrale aggiunta
		assertTrue(sonda.getOsservatori().contains(centrale));
	}

	// secondo test del metodo addOsservatore
//	@Test
//	public void testAddOsservatore() {
//		Sonda sonda = new Sonda();
//		Centrale centrale = new Centrale();
//
//		sonda.addOsservatore(centrale);
//
//		// verifica che la dimensione della lista osservatori sia 1
//		assertEquals(1, sonda.getOsservatori().size());
//		// verifica che l'osservatore aggiunto sia la centrale
//		assertEquals(centrale, sonda.getOsservatori().get(0));
//	}

}
