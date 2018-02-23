package com.ocr.options;

import java.io.Serializable;

public abstract class Options implements Option, Serializable{

	private double prix;
	public String name;

	public double getPrix() {
		return prix;
	}

	public Options (double pPrix, String pName) {
		this.prix = pPrix;
		this.name = pName;
	}
	
	public String toString() {
		return this.name + " (" + this.getPrix() + "€)";
	}
}
