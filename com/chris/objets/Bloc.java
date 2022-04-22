package com.chris.objets;



import javax.swing.ImageIcon;
//Cette class herite de la class objet (extends Objet)
public class Bloc extends Objet {
	
	
	public Bloc(int x, int y) {
		super(x, y, 45, 65);
		super.icoObjet = new ImageIcon(getClass().getResource("/images/bloc.png"));
		super.imgObjet = this.icoObjet.getImage();
	}

	
}
