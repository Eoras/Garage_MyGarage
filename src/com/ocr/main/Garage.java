package com.ocr.main;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.StreamCorruptedException;
import java.util.ArrayList;
import java.util.List;

import com.ocr.vehicules.Vehicule;

class Garage {

	private List<Vehicule> vehicules = new ArrayList<Vehicule>();

	public String toString() {
		String str;
		str = "**********************************************\n";
		str += "*                Eöras Garage                *\n";
		str += "**********************************************\n";
		return str;
	}

	Garage () {
	}

	public void addVoiture(Vehicule vehicule) {
		this.vehicules.add(vehicule);
		this.writeFile(vehicules);
		System.out.println(vehicule);
		//this.readFile();
	}


	public void writeFile(List<Vehicule> vehicules) {
		ObjectOutputStream oos;

		try {
			oos = new ObjectOutputStream(
					new BufferedOutputStream(
							new FileOutputStream(
									new File("src/com/ocr/main/myGarage.txt"))));

			for (Vehicule v : vehicules) {
				oos.writeObject(v);
			}
			oos.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void readFile() {
		//On récupère maintenant les données !
		ObjectInputStream ois;

		try {
			ois = new ObjectInputStream(
					new BufferedInputStream(
							new FileInputStream(
									new File("src/com/ocr/main/myGarage.txt"))));
			try {
				if(this.vehicules.size() <= 0) {
					System.out.println("----- Début des véhicules sauvegardés du fichier -----");
					Object obj = null;
					while(true)			
						this.addVoiture((Vehicule)ois.readObject());
				}
				//System.out.println(((Vehicule)ois.readObject()).toString());

			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (EOFException e) {
				System.out.println("----- Fin des véhicules sauvegardés du fichier -----");
			} catch (IOException e) {
				e.printStackTrace();
			}
			ois.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EOFException e) {
			// null
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
