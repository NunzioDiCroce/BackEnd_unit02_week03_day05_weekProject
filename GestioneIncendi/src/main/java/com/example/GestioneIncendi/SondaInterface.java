package com.example.GestioneIncendi;

//DESIGN PATTERN: OBSERVER
//Centrale is the Observer

public interface SondaInterface {

	void addOsservatore(Centrale osservatore);

	void removeOsservatore(Centrale osservatore);

	void notifyOsservatori();

}
