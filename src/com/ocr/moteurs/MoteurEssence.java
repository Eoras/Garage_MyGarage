package com.ocr.moteurs;

public class MoteurEssence extends Moteur {

	public MoteurEssence(String pMoteur, double pPrix) {
		super(pMoteur, pPrix);
		this.type = TypeMoteur.ESSENCE;
	}
	
}
