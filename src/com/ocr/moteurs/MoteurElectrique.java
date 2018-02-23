package com.ocr.moteurs;

public class MoteurElectrique extends Moteur {

	public MoteurElectrique(String pMoteur, double pPrix) {
		super(pMoteur, pPrix);
		this.type = TypeMoteur.ELECTRIQUE;
	}
	
}
