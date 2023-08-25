package com.example.GestioneIncendi;

public interface SondaInterface {

	void addOsservatore(Centrale centrale);

	void removeOsservatore(Centrale centrale);

	void notifyOsservatori();

}
