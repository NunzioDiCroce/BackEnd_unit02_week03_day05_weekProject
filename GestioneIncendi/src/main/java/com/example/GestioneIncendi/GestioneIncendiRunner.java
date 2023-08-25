package com.example.GestioneIncendi;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

// HO REALIZZATO L'APPLICAZIONE IMPLEMENTANDO IL DESIGN PATTERN OBSERVER

@Component
public class GestioneIncendiRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Centrale centrale = new Centrale();

		// SONDA01
		Sonda sonda01 = new Sonda();
		sonda01.setIdSonda(1);
		sonda01.setLatitudine(10.0000);
		sonda01.setLongitudine(10.0000);
		sonda01.setLivelloFumo(0);
		sonda01.addOsservatore(centrale);

		// SONDA02
		Sonda sonda02 = new Sonda();
		sonda02.setIdSonda(2);
		sonda02.setLatitudine(20.0000);
		sonda02.setLongitudine(20.0000);
		sonda02.setLivelloFumo(0);
		sonda02.addOsservatore(centrale);

		// SONDA03
		Sonda sonda03 = new Sonda();
		sonda03.setIdSonda(3);
		sonda03.setLatitudine(30.0000);
		sonda03.setLongitudine(30.0000);
		sonda03.setLivelloFumo(0);
		sonda03.addOsservatore(centrale);

		// SONDA04
		Sonda sonda04 = new Sonda();
		sonda04.setIdSonda(4);
		sonda04.setLatitudine(40.0000);
		sonda04.setLongitudine(40.0000);
		sonda04.setLivelloFumo(6);
		sonda04.addOsservatore(centrale);

	}

}
