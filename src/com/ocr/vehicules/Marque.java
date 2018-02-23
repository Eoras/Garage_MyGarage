package com.ocr.vehicules;

public enum Marque {
	RENO("Reno"),
	PIGEOT("Pigeot"),
	TROEN("Troen");
	
	private String name;
	
	Marque(String nom) {
		this.name = nom;
	}
	
	public String toString() {
		return this.getName();
	}
	
	private String getName() {
		return name;
	}
}
