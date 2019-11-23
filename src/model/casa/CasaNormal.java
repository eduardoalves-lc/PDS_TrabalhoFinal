package model.casa;

import java.awt.Point;

import controladores.ControleJogo;
import model.jogador.Jogador;

public class CasaNormal extends CasaTabuleiro{
	
	public CasaNormal(int indice, Point coordenada) {
		super(indice, coordenada);
	}

	@Override
	public void acao(Jogador jogador) {
		ControleJogo.getInstance().Mensagem("Continuar!!");
	}

}
