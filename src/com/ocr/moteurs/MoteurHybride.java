package com.ocr.moteurs;

public class MoteurHybride extends Moteur {

	public MoteurHybride(String pMoteur, double pPrix) {
		super(pMoteur, pPrix);
		this.type = TypeMoteur.HYBRIDE;
	}
	
}
