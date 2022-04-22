package com.chris.affichage;

public class Score {
	
	private final int NBRE_TOTAL_PIECES = 10;
	private int nbrePieces;
	
	public Score() {
		this.nbrePieces = 0;
	}

	public int getNbrePieces() {
		return nbrePieces;
	}

	public void setNbrePieces(int nbrePieces) {
		this.nbrePieces = nbrePieces;
	}

	public int getNBRE_TOTAL_PIECES() {
		return NBRE_TOTAL_PIECES;
	}
}
