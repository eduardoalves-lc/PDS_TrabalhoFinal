package model.casa;

import java.awt.Point;
import interfaces.IEfeito;

public abstract class CasaTabuleiro implements IEfeito{

	private int indice;
	private Point coordenada;
	
	public CasaTabuleiro(int indice, Point coordenada) {
		this.indice = indice;
		this.coordenada = coordenada;
	}
	
	public int getIndice() {
		return indice;
	}
	
	public Point getCoordenada() {
		return coordenada;
	}
	
}
