package com.example.GestioneIncendi;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Sonda {

	private int idSonda;
	private double latitudine;
	private double longitudine;
	private int livelloFumo;

	public void rilevaLivelloFumo(int livelloFumo) {

		this.livelloFumo = livelloFumo;

		if (livelloFumo > 5) {

			// notificaObserves

		}
	}

}
