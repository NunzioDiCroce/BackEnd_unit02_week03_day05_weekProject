package com.example.GestioneIncendi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// DESIGN PATTERN: OBSERVER
// This class is the Observer

@Component
public class Centrale {

	// Parametrizzazione canale di comunicazione sonda - centrale
	@Value("${appChannel}")
	private String appChannel;

	public void comunicaAllarme(Sonda sonda) {
		System.out.println("");
		System.out.println("GESTIONE INCENDI APP >>> Messaggio di rilevazione incendio");
		System.out.println(appChannel + "http://host/alarm?idsonda=" + sonda.getIdSonda() + "&lat="
				+ sonda.getLatitudine() + "&lon=" + sonda.getLatitudine() + "&smokelevel=" + sonda.getLivelloFumo());
	}

}
