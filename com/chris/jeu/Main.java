package com.chris.jeu;

import javax.swing.JFrame;

public class Main {
	public static Scene scene;//Static permet d'acceder a toute les class
	
	public static void main(String[] args) {
		JFrame fenetre = new JFrame("Jeu style mario");
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setSize(700, 360);
		fenetre.setLocationRelativeTo(null);
		fenetre.setResizable(false);
		fenetre.setAlwaysOnTop(true);
		
		scene = new Scene();
		fenetre.setContentPane(scene);
		fenetre.setVisible(true);
	}

}
