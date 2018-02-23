package com.ocr.vehicules;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.ocr.moteurs.*;
import com.ocr.options.*;

public class Vehicule implements Serializable {

	// VARIABLES D'INSTANCE
	private double prix;
	protected String nom;
	private List<Option> options = new ArrayList<Option>();
	protected Marque nomMarque;
	public Moteur moteur;
	

	// CONSTRUCTEUR:
	public Vehicule() {
	}


	// METHODES
	public void setMoteur(Moteur moteur) {
		this.moteur = moteur;
	}
	
	
	public void addOption(Option opt) {
		this.options.add(opt);
	}

	
	public String getMarque() {
		String str = nomMarque.toString();
		return str.toUpperCase();
	}

	
	public String getNom() {
		return this.nom;
	}
	
	
	public List<Option> getOptions() {
		/*Stream<Option> so = this.options.stream();
		
		List<Option> op = so.collect(Collectors.toList());
		return op;*/
		return options;
	}

	
	public double getPrix() {
		double resultSum = 0.0d;
		Stream<Option> sd = this.getOptions().stream();
		resultSum = sd.map(x -> x.getPrix())
				.reduce(0.0d, (x,y) -> x+y);
		
		return resultSum + this.moteur.getPrix();
	}
	
	
	public String toString() {
		return  "+ Voiture " + this.getMarque() + " : "
				+ this.getNom() + " " + this.moteur + " " + this.getOptions() + " d'une valeur totale de " + this.getPrix() + "€";
	}
}
