package com.chris.jeu;

import java.awt.Font;
//C'est la class la plus importante de l'application,
//Elle accesible pour toute les autre class, c'est le moteur graphic
import java.awt.Graphics;


import java.awt.Graphics2D;
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import com.chris.affichage.CompteARebours;
import com.chris.affichage.Score;
import com.chris.audio.Audio;
import com.chris.objets.Bloc;
import com.chris.objets.Objet;
import com.chris.objets.Piece;
import com.chris.objets.TuyauRouge;
import com.chris.personnage.Champ;
import com.chris.personnage.Mario;
import com.chris.personnage.Tortue;

@SuppressWarnings("serial")
public class Scene extends JPanel {
	//Ne pas oublié de faire l'import java.awt ou l'import du autre class
	//exemple personnage.mario
	private ImageIcon icoFond; 
	private Image imgFond1;
	private Image imgFond2;
	
	
	private ImageIcon icoChateau1;
	private Image imgChateau1;
	private ImageIcon icoDepart;
	private Image imgDepart;
	private int xFond1;
	private int xFond2;
	private int dx;
	private int xPos;//Position absolue dans le jeu
	private int ySol;//Hauteur du sol
	private int hauteurPlafond;//Hauteur du plafond
	
	public Mario mario;
	//Importé la class tuyauRouge dans la class scene
	public TuyauRouge tuyauRouge1;
	public TuyauRouge tuyauRouge2;
	public TuyauRouge tuyauRouge3;
	public TuyauRouge tuyauRouge4;
	public TuyauRouge tuyauRouge5;
	public TuyauRouge tuyauRouge6;
	public TuyauRouge tuyauRouge7;
	public TuyauRouge tuyauRouge8;
	
	public Bloc bloc1;
	public Bloc bloc2;
	public Bloc bloc3;
	public Bloc bloc4;
	public Bloc bloc5;
	public Bloc bloc6;
	public Bloc bloc7;
	public Bloc bloc8;
	public Bloc bloc9;
	public Bloc bloc10;
	public Bloc bloc11;
	public Bloc bloc12;
	
	public Piece piece1;
	public Piece piece2;
	public Piece piece3;
	public Piece piece4;
	public Piece piece5;
	public Piece piece6;
	public Piece piece7;
	public Piece piece8;
	public Piece piece9;
	public Piece piece10;
	
	public Champ champ1;
	public Champ champ2;
	public Champ champ3;
	public Champ champ4;
	public Champ champ5;
	public Champ champ6;
	public Champ champ7;
	public Champ champ8;
	
	public Tortue tortue1;
	public Tortue tortue2;
	public Tortue tortue3;
	public Tortue tortue4;
	public Tortue tortue5;
	public Tortue tortue6;
	public Tortue tortue7;
	public Tortue tortue8;
	public Tortue tortue9;
	
	
	private ImageIcon icoDrapeau;
	private Image imgDrapeau;
	private ImageIcon icoChateauFin;
	private Image imgChateauFin;
	
	private ArrayList<Objet> tabObjet;//Tableau qui enregistre tout les objet du jeu
	private ArrayList<Piece> tabPiece;
	private ArrayList<Tortue> tabTortue;
	private ArrayList<Champ> tabChamp;
	
	private Score score;
	private Font police;
	private CompteARebours compteARebours;
	private boolean ok;
	
	/*****CONSTRUCTEUR****/
	public Scene() {
		super();
		
		this.xFond1 = -50;
		this.xFond2 = 750;
		this.dx = 0;
		this.xPos = -1;
		this.ySol = 293;
		this.hauteurPlafond = 0;
		this.ok = true;
		
		icoFond = new ImageIcon(getClass().getResource("/images/fondEcran.png"));
		this.imgFond1 = this.icoFond.getImage();
		this.imgFond2 = this.icoFond.getImage();
		
		
		this.icoChateau1 = new ImageIcon(getClass().getResource("/images/chateau1.png"));
		this.imgChateau1 = this.icoChateau1.getImage();
		this.icoDepart = new ImageIcon(getClass().getResource("/images/depart.png"));
		this.imgDepart = this.icoDepart.getImage();
		
		//Position initial des personnages et objets (x largeur = 300 et y hauteur = 245
		mario = new Mario(300, 245);
		
		
		
		tuyauRouge1 = new TuyauRouge(600, 230);
		tuyauRouge2 = new TuyauRouge(1000, 230);
		tuyauRouge3 = new TuyauRouge(1600, 230);
		tuyauRouge4 = new TuyauRouge(1900, 230);
		tuyauRouge5 = new TuyauRouge(2500, 230);
		tuyauRouge6 = new TuyauRouge(3000, 230);
		tuyauRouge7 = new TuyauRouge(3800, 230);
		tuyauRouge8 = new TuyauRouge(4500, 230);
		
		bloc1 = new Bloc(400, 180);
		bloc2 = new Bloc(1200, 180);
		bloc3 = new Bloc(1270, 170);
		bloc4 = new Bloc(1340, 160);
		bloc5 = new Bloc(2000, 180);
		bloc6 = new Bloc(2600, 160);
		bloc7 = new Bloc(2650, 180);
		bloc8 = new Bloc(3500, 140);
		bloc9 = new Bloc(3550, 170);
		bloc10 = new Bloc(4000, 170);
		bloc11 = new Bloc(4200, 200);
		bloc12 = new Bloc(4300, 210);
		
		piece1 = new Piece(402, 145);
		piece2 = new Piece(1202, 140);
		piece3 = new Piece(1272, 95);
		piece4 = new Piece(1342, 40);
		piece5 = new Piece(1650, 145);
		piece6 = new Piece(2650, 145);
		piece7 = new Piece(3000, 135);
		piece8 = new Piece(3400, 125);
		piece9 = new Piece(4200, 145);
		piece10 = new Piece(4600, 40);
		
		champ1 = new Champ(800, 263);
		champ2 = new Champ(1100, 263);
		champ3 = new Champ(2100, 263);
		champ4 = new Champ(2400, 263);
		champ5 = new Champ(3200, 263);
		champ6 = new Champ(3500, 263);
		champ7 = new Champ(3700, 263);
		champ8 = new Champ(4500, 263);
		
		tortue1 = new Tortue(950, 243);
		tortue2 = new Tortue(1500, 243);
		tortue3 = new Tortue(1800, 243);
		tortue4 = new Tortue(2400, 243);
		tortue5 = new Tortue(3100, 243);
		tortue6 = new Tortue(3600, 243);
		tortue7 = new Tortue(3900, 243);
		tortue8 = new Tortue(4200, 243);
		tortue9 = new Tortue(4400, 243);
		
		this.icoChateauFin = new ImageIcon(getClass().getResource("/images/chateauFin.png"));
		this.imgChateauFin = this.icoChateauFin.getImage();
		this.icoDrapeau = new ImageIcon(getClass().getResource("/images/drapeau.png"));
		this.imgDrapeau = this.icoDrapeau.getImage();
		
		//Declaration des objets en tableau
		tabObjet = new ArrayList<Objet>();
		
		this.tabObjet.add(this.tuyauRouge1);
		this.tabObjet.add(this.tuyauRouge2);
		this.tabObjet.add(this.tuyauRouge3);
		this.tabObjet.add(this.tuyauRouge4);
		this.tabObjet.add(this.tuyauRouge5);
		this.tabObjet.add(this.tuyauRouge6);
		this.tabObjet.add(this.tuyauRouge7);
		this.tabObjet.add(this.tuyauRouge8);
		
		this.tabObjet.add(this.bloc1);
		this.tabObjet.add(this.bloc2);
		this.tabObjet.add(this.bloc3);
		this.tabObjet.add(this.bloc4);
		this.tabObjet.add(this.bloc5);
		this.tabObjet.add(this.bloc6);
		this.tabObjet.add(this.bloc7);
		this.tabObjet.add(this.bloc8);
		this.tabObjet.add(this.bloc9);
		this.tabObjet.add(this.bloc10);
		this.tabObjet.add(this.bloc11);
		this.tabObjet.add(this.bloc12);
		
		tabPiece = new ArrayList<Piece>();
		this.tabPiece.add(this.piece1);
		this.tabPiece.add(this.piece2);
		this.tabPiece.add(this.piece3);
		this.tabPiece.add(this.piece4);
		this.tabPiece.add(this.piece5);
		this.tabPiece.add(this.piece6);
		this.tabPiece.add(this.piece7);
		this.tabPiece.add(this.piece8);
		this.tabPiece.add(this.piece9);
		this.tabPiece.add(this.piece10);
		
		tabChamp = new ArrayList<Champ>();
		this.tabChamp.add(this.champ1);
		this.tabChamp.add(this.champ2);
		this.tabChamp.add(this.champ3);
		this.tabChamp.add(this.champ4);
		this.tabChamp.add(this.champ5);
		this.tabChamp.add(this.champ6);
		this.tabChamp.add(this.champ7);
		this.tabChamp.add(this.champ8);
		
		tabTortue = new ArrayList<Tortue>();
		this.tabTortue.add(this.tortue1);
		this.tabTortue.add(this.tortue2);
		this.tabTortue.add(this.tortue3);
		this.tabChamp.add(this.champ4);
		this.tabTortue.add(this.tortue5);
		this.tabTortue.add(this.tortue6);
		this.tabTortue.add(this.tortue7);
		this.tabTortue.add(this.tortue8);
		this.tabTortue.add(this.tortue9);
		
		this.setFocusable(true);
		this.requestFocusInWindow();
		this.addKeyListener(new Clavier());
		
		score = new Score();
		police = new Font("arial", Font.PLAIN, 18);
		
		Thread chronoEcran = new Thread(new Chrono());
		chronoEcran.start();
				
		}
	
	//*****GETTERS*****//
	public int getDx() {return dx;}
	
	public int getxPos() {return xPos;}
	
	public int getySol() {return ySol;}
	
	public int getHauteurPlafond() {return hauteurPlafond;}
	
	//******SETTERS*****//
	
	public void setySol(int ySol) {this.ySol = ySol;}

	public void setDx(int dx) {this.dx = dx;}

	public void setHauteurPlafond(int hauteurPlafond) {this.hauteurPlafond = hauteurPlafond;}

	public void setxPos(int xPos) {this.xPos = xPos;}

	public void setxFond1(int xFond1) {this.xFond1 = xFond1;}

	public void setxFond2(int xFond2) {this.xFond2 = xFond2;}
	
	//*******METHODE******//
	//Deplacement de l'image "fixe" en simultanné avec le deplacement de mario
	public void deplacementFond() {
		if(this.xPos >= 0 && this.xPos <= 4430) {
			//Mise a jour despositions des elements du jeu lors du deplacement du personnage
			this.xPos = this.xPos + this.dx;
			this.xFond1 = this.xFond1 - this.dx;
			this.xFond2 = this.xFond2 - this.dx;
		}
		//Fond en permanence
		if(this.xFond1 == -800) {this.xFond1 = 800;}
		else if(this.xFond2 == -800) {this.xFond2 = 800;}
		else if(this.xFond1 == 800) {this.xFond1 = -800;}
		else if(this.xFond2 == 800) {this.xFond2 = -800;}
	}
	
	private boolean partieGagnee() {
		if(this.compteARebours.getCompteurTemps() > 0 && this.mario.isVivant() == true
				&& this.score.getNbrePieces() == 10 && this.xPos > 4400) {
			if(this.ok == true) {
				Audio.playSound("/audio/partieGagnee.wav");
				this.ok = false;
			}
			return true;
		}
		else {
			return false;
		}
	}
	
	private boolean partiePerdu() {
		if(this.mario.isVivant() == false || this.compteARebours.getCompteurTemps() <= 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean finDePartie() {
		if(this.partieGagnee() == true || this.partiePerdu() == true) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics g2 = (Graphics2D)g;
		
		//Detection contact mario avec les objets
		for(int i = 0; i < this.tabObjet.size(); i++) {
			//Contact mario et objet
			if(this.mario.proche(this.tabObjet.get(i))) {
				this.mario.contact(this.tabObjet.get(i));
			}
			//Contact champ et objet
			for(int j = 0; j < this.tabChamp.size(); j++) {
				if(this.tabChamp.get(j).proche(this.tabObjet.get(i))) {
					this.tabChamp.get(j).contact(this.tabObjet.get(i));
				}
			}
			//Contact tortue et objet
			for(int j = 0; j < this.tabTortue.size(); j++) {
				if(this.tabTortue.get(j).proche(this.tabObjet.get(i))) {
					this.tabTortue.get(j).contact(this.tabObjet.get(i));
				}
			}
		}
		
		//detection des pieces avec mario
		for(int i = 0; i < this.tabPiece.size(); i++) {
			if(this.mario.proche(this.tabPiece.get(i))) {
				if(this.mario.contactPiece(this.tabPiece.get(i))) {
					Audio.playSound("/audio/piece.wav");
					this.tabPiece.remove(i);
					this.score.setNbrePieces(this.score.getNbrePieces() + 1);
				}
			}
		}
		//Detection des contacts des champignons avec les personnages (hors mario)
		for(int i = 0; i < this.tabChamp.size(); i++) {
			//champignons
			for(int j = 0; j < this.tabChamp.size(); j++) {
				if(j != i) {
					if(this.tabChamp.get(j).proche(this.tabChamp.get(i))) {
						this.tabTortue.get(j).contact(this.tabChamp.get(i));
						if(this.tabChamp.get(i).isVivant() == false) {
							Audio.playSound("/audio/ecrasePersonnage.wav");
						}
					}
				}
			}
			//tortues
			for(int j = 0; j < this.tabTortue.size(); j++) {
				if(this.tabTortue.get(j).proche(this.tabChamp.get(i))) {
					this.tabTortue.get(j).contact(this.tabChamp.get(i));
					if(this.tabTortue.get(i).isVivant() == false) {
						Audio.playSound("/audio/ecrasePersonnage.wav");
					}
				}
			}
		}
		
		//Detection des contacts de mario avec les personnages
		//Champignons
		for(int i = 0; i < this.tabChamp.size(); i++) {
			if(this.mario.proche(this.tabChamp.get(i)) && this.tabChamp.get(i).isVivant() == true) {
				this.mario.contact(this.tabChamp.get(i));
			}
		}
		//Tortues
		for(int i = 0; i < this.tabTortue.size(); i++) {
			if(this.mario.proche(this.tabTortue.get(i)) && this.tabTortue.get(i).isVivant() == true) {
				this.mario.contact(this.tabTortue.get(i));
			}
		}
		
		//Deplacement de tout les objets "fixe" du jeu
		this.deplacementFond();
		if(this.xPos >= 0 && this.xPos <= 4430) {
			for(int i = 0; i < this.tabObjet.size(); i++) {
				this.tabObjet.get(i).deplacement();
			}	
			for( int i = 0; i < this.tabPiece.size(); i++) {
					this.tabPiece.get(i).deplacement();
			}
			for(int i =0; i < this.tabChamp.size(); i++) {
				this.tabChamp.get(i).deplacement();
			}
			for(int i = 0; i < this.tabTortue.size(); i++) {
				this.tabTortue.get(i).deplacement();
			}
		}
		
		//System.out.println(this.tuyauRouge1.getX());
		
		g2.drawImage(this.imgFond1, this.xFond1, 0, null);
		g2.drawImage(this.imgFond2, this.xFond2, 0, null);
		g2.drawImage(this.imgChateau1, 10 - this.xPos, 95, null);
		g2.drawImage(this.imgDepart, 220 - this.xPos, 234, null);
		
		for(int i = 0; i < this.tabObjet.size(); i++) {
			g2.drawImage(this.tabObjet.get(i).getImgObjet(), this.tabObjet.get(i).getX(), this.tabObjet.get(i).getY(), null);
		}
		
		for(int i = 0; i < this.tabPiece.size(); i++) {
			g2.drawImage(this.tabPiece.get(i).bouge(), this.tabPiece.get(i).getX(), this.tabPiece.get(i).getY(), null);
		}
		g2.drawImage(imgDrapeau, 4650 - this.xPos, 115, null );
		g2.drawImage(imgChateauFin, 5000 - this.xPos, 145, null);
		if(this.mario.isSaut()) {g2.drawImage(this.mario.saute(), this.mario.getX(), this.mario.getY(), null);}
		else {g2.drawImage(this.mario.marche("mario", 25), this.mario.getX(), this.mario.getY(), null);
		}
		//Images des champignons et des tortues
		for(int i = 0; i <this.tabChamp.size(); i++) {
			if(this.tabChamp.get(i).isVivant() == true) {
			g2.drawImage(this.tabChamp.get(i).marche("champ", 45 ), this.tabChamp.get(i).getX(), this.tabChamp.get(i).getY(), null);
		}
		else {
			g2.drawImage(this.tabChamp.get(i).meurt(), this.tabChamp.get(i).getX(), this.tabChamp.get(i).getY() + 20, null);
		}
		}
		for(int i = 0; i < this.tabTortue.size(); i++) {
			if(this.tabTortue.get(i).isVivant() == true) {
			g2.drawImage(this.tabTortue.get(i).marche("tortue", 45), this.tabTortue.get(i).getX(), this.tabTortue.get(i).getY(), null);
		}
		else {
			g2.drawImage(this.tabTortue.get(i).meurt(), this.tabTortue.get(i).getX(), this.tabTortue.get(i).getY() + 20, null);
		}
		
		}
		
		//Mise a jour du score
		g2.setFont(police);
		g2.drawString(this.score.getNbrePieces() + "piéce(s) trouvée(s) sur" + this.score.getNBRE_TOTAL_PIECES(), 460, 25);
		
		//Mise a jour du temps de jeu restant
		g2.drawString(this.compteARebours.getStr(), 5, 25);
		
		//Fin de partie
		if(this.finDePartie() == true) {
			Font policeFin = new Font("Arial", Font.BOLD, 50);
			g2.setFont(policeFin);
			if(this.partieGagnee() == true) {
				g2.drawString("Vous avez gagné !!", 120, 180);
			}
			else {
				g2.drawString("Vous avez perdu", 120, 180 );
			}
		}
	
	}
	
	
}		
				
				
				
				
				

