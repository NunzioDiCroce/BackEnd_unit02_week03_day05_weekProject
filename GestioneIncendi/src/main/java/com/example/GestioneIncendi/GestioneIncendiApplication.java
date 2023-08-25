package com.example.GestioneIncendi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//DESIGN PATTERN: OBSERVER
//Centrale is the Observer

@SpringBootApplication
public class GestioneIncendiApplication {

//	// Parametrizzazione canale di comunicazione sonda - centrale
//	@Value("${appChannel}")
//	private static String appChannel;

	public static void main(String[] args) {
		SpringApplication.run(GestioneIncendiApplication.class, args);

		Centrale centrale = new Centrale();

		// SONDA01
		Sonda sonda01 = new Sonda();
		sonda01.setIdSonda(1);
		sonda01.setLatitudine(10.0000);
		sonda01.setLongitudine(10.0000);
		sonda01.addOsservatore(centrale);
		// sonda01.setLivelloFumo(0);
		sonda01.rilevaLivelloFumo(0);

		// SONDA02
		Sonda sonda02 = new Sonda();
		sonda02.setIdSonda(2);
		sonda02.setLatitudine(20.0000);
		sonda02.setLongitudine(20.0000);
		sonda02.addOsservatore(centrale);
		// sonda02.setLivelloFumo(0);
		sonda02.rilevaLivelloFumo(5);

		// SONDA03
		Sonda sonda03 = new Sonda();
		sonda03.setIdSonda(3);
		sonda03.setLatitudine(30.0000);
		sonda03.setLongitudine(30.0000);
		sonda03.addOsservatore(centrale);
		// sonda03.setLivelloFumo(0);
		sonda03.rilevaLivelloFumo(6);

		// SONDA04
		Sonda sonda04 = new Sonda();
		sonda04.setIdSonda(4);
		sonda04.setLatitudine(40.0000);
		sonda04.setLongitudine(40.0000);
		sonda04.addOsservatore(centrale);
		// sonda04.setLivelloFumo(6);
		sonda04.rilevaLivelloFumo(10);

	}

}
