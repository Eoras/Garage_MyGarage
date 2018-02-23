package com.ocr.moteurs;

import java.io.Serializable;

public abstract class Moteur implements Serializable {

	protected TypeMoteur type;
	protected String cylindre;
	protected double prix;
	
	Moteur (String pCylindre, double pPrix) {
		this.prix = pPrix;
		this.cylindre = pCylindre;
	}
	
	public String toString() {
		return "Moteur " + this.type + " " + this.cylindre + " (" + this.prix + "€)";
	}
	
	public double getPrix() {
		return prix;
	}

}
