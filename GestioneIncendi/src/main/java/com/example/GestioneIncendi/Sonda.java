package com.example.GestioneIncendi;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Sonda implements SondaInterface {

	private int idSonda;
	private double latitudine;
	private double longitudine;
	private int livelloFumo;
	private List<Centrale> osservatori = new ArrayList<>();

	@Override
	public void addOsservatore(Centrale osservatore) {
		// TODO Auto-generated method stub
		osservatori.add(osservatore);
	}

	@Override
	public void removeOsservatore(Centrale osservatore) {
		// TODO Auto-generated method stub
		osservatori.remove(osservatore);
	}

	@Override
	public void notifyOsservatori() {
		// TODO Auto-generated method stub
		for (Centrale osservatore : osservatori) {
			osservatore.comunicaAllarme(this);
		}
	}

	public void rilevaLivelloFumo(int livelloFumo) {
		this.livelloFumo = livelloFumo;
		if (livelloFumo > 5) {
			notifyOsservatori();
		}
	}

}
