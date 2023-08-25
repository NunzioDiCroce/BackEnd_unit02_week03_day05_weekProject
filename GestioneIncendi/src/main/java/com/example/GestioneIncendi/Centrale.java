package com.example.GestioneIncendi;

public class Centrale {

	public void comunicaAllarme(Sonda sonda) {
		System.out.println("http://host/alarm?idsonda=" + sonda.getIdSonda() + "&lat=" + sonda.getLatitudine() + "&lon="
				+ sonda.getLatitudine() + "&smokelevel=" + sonda.getLivelloFumo());
	}

}
