package com.example.GestioneIncendi;

public interface SondaInterface {

	void addOsservatore(Centrale osservatore);

	void removeOsservatore(Centrale osservatore);

	void notifyOsservatori();

}
