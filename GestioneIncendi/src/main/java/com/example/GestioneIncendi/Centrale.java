package com.example.GestioneIncendi;

// This class is the Observer

public class Centrale {

	public void comunicaAllarme(Sonda sonda) {
		System.out.println("");
		System.out.println("GESTIONE INCENDI APP >>> Messaggio di rilevazione incendio");
		System.out.println("http://host/alarm?idsonda=" + sonda.getIdSonda() + "&lat=" + sonda.getLatitudine() + "&lon="
				+ sonda.getLatitudine() + "&smokelevel=" + sonda.getLivelloFumo());
	}

}
