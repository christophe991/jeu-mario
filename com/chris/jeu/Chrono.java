package com.chris.jeu;


//Mettre methode de la class automatiquement//
public class Chrono implements Runnable {
	private final int PAUSE = 3; //Temps d'attente entre 2 tours de boucle//
	
	@Override
	public void run() {
		
		while(true) {
			Main.scene.repaint();
			//System.out.println("ok"); met un message en console pour verifier le fonctionnement
			try {
				Thread.sleep(PAUSE);
			}catch(InterruptedException e) {}
		}
	}

}
