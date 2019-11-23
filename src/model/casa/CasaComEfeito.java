package model.casa;

import java.awt.Point;

public abstract class CasaComEfeito extends CasaTabuleiro{

	private int destino;
	
	public CasaComEfeito(int indice, Point coordenada, int destino) {
		super(indice, coordenada);
		this.destino = destino;
	}
	
	public int getDestino() {
		return destino - 1;
	}
	
}
