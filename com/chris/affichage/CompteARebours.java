package com.chris.affichage;

public class CompteARebours implements Runnable {
	
	private final int PAUSE = 1000;
	private int compteurTemps;
	private String str;
	
	public CompteARebours() {
		this.compteurTemps = 100;
		this.str = "Temps restant : 100";
		
		Thread compteARebours = new Thread(this);
		compteARebours.start();
	}
	
	
	public int getCompteurTemps() {
		return compteurTemps;
	}


	public String getStr() {
		return str;
	}


	@Override
	public void run() {
		
		while(true) {
			try {Thread.sleep(PAUSE);
		}
		catch(InterruptedException e) {}
		this.compteurTemps--;
		this.str = "Temps restant : " + this.compteurTemps;
		
		
	}
	}

}
