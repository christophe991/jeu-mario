package com.chris.jeu;
//Class clavier et utiliser par utilisateur
import java.awt.event.KeyEvent;

import java.awt.event.KeyListener;
import com.chris.audio.Audio;

 //Afecttation des touches
public class Clavier implements KeyListener {

	

	@Override
	//Quand on appuie sur la touche
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_RIGHT) {//Fleche droite
			if(Main.scene.getxPos() == -1) {
				//réinitialisation de l'image de fond et la position de mario
				Main.scene.setxPos(0);
				Main.scene.setxFond1(-50);
				Main.scene.setxFond2(750);
			}
			Main.scene.mario.setMarche(true);
			Main.scene.mario.setVersDroite(true);
			Main.scene.setDx(1);
		}else if(e.getKeyCode() == KeyEvent.VK_LEFT) {//Fleche gauche
			Main.scene.mario.setMarche(true);
			Main.scene.mario.setVersDroite(false);
			Main.scene.setDx(-1);
		}
		
		//Mario saute
		if(e.getKeyCode() == KeyEvent.VK_SPACE){//Barre espace
			Main.scene.mario.setSaut(true);
			Audio.playSound("/audio/saut.wav");
		}
		
		
		
	}

	@Override
	//Quand on relache la touche//
	public void keyReleased(KeyEvent e) {
		Main.scene.mario.setMarche(false);
		Main.scene.setDx(0);
		
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		
		
	}

}
