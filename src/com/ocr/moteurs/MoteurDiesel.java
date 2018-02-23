package com.ocr.moteurs;

public class MoteurDiesel extends Moteur {

	public MoteurDiesel(String pMoteur, double pPrix) {
		super(pMoteur, pPrix);
		this.type = TypeMoteur.DIESEL;
	}
	
}
