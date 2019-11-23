package model.casa;

import java.awt.Point;

import controladores.ControleCasas;
import controladores.ControleJogo;
import model.jogador.Jogador;

public class CasaFinal extends CasaTabuleiro{

	public CasaFinal(int indice, Point coordenada) {
		super(indice, coordenada);
	}

	@Override
	public void acao(Jogador jogador) {
		jogador.setCasaAtual(ControleCasas.getInstance().getCasas().get(99));
		ControleJogo.getInstance().Mensagem("PARABÉNS!!! VOCÊ GANHOU!!!");
	}

}
