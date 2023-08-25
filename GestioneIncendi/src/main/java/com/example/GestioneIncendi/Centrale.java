package com.example.GestioneIncendi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

// DESIGN PATTERN: OBSERVER
// This class is the Observer

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Slf4j
@Component
public class Centrale {

	// Parametrizzazione canale di comunicazione sonda - centrale
	@Value("${appChannel}")
	private String appChannel;

//	public Centrale(String appChannel) {
//		this.appChannel = appChannel;
//	}

	// Metodo SENZA Parametrizzazione canale di comunicazione sonda - centrale
	public void comunicaAllarme(Sonda sonda) {
		System.out.println("");
		System.out.println("GESTIONE INCENDI APP >>> Messaggio di rilevazione incendio");
		System.out.println("http://host/alarm?idsonda=" + sonda.getIdSonda() + "&lat=" + sonda.getLatitudine() + "&lon="
				+ sonda.getLatitudine() + "&smokelevel=" + sonda.getLivelloFumo());
	}

	// Metodo CON Parametrizzazione canale di comunicazione sonda - centrale
//	public void comunicaAllarme(Sonda sonda) {
//		System.out.println("");
//		System.out.println("GESTIONE INCENDI APP >>> Messaggio di rilevazione incendio");
//		System.out.println(appChannel + "http://host/alarm?idsonda=" + sonda.getIdSonda() + "&lat="
//				+ sonda.getLatitudine() + "&lon=" + sonda.getLatitudine() + "&smokelevel=" + sonda.getLivelloFumo());
//	}

}
