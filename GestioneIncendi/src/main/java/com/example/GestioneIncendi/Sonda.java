package com.example.GestioneIncendi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Slf4j
@Component
public class Sonda implements SondaInterface {

//	private static final Logger logger = LoggerFactory.getLogger(Sonda.class);

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

//		logger.info("********** CHECK **********");

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
