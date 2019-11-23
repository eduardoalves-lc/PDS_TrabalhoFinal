package model.casa;

import java.awt.Point;

import controladores.ControleCartas;
import model.jogador.Jogador;

public class CasaArmadilha extends CasaTabuleiro {	
	
	public CasaArmadilha(int indice, Point coordenada) {
		super(indice, coordenada);
	}

	@Override
	public void acao(Jogador jogador) {
		ControleCartas.getInstance().proximaCarta().acao(jogador);
	}

}
