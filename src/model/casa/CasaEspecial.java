package model.casa;

import java.awt.Point;

import controladores.ControleCasas;
import controladores.ControleJogo;
import model.jogador.Jogador;

public class CasaEspecial extends CasaComEfeito{


	public CasaEspecial(int indice, Point coordenada, int destino) {
		super(indice, coordenada, destino);
	}

	@Override
	public void acao(Jogador jogador) {
		jogador.setCasaAtual(ControleCasas.getInstance().getCasas().get(this.getDestino()));
		ControleJogo.getInstance().Mensagem("casa da sorte!! Avance 3 casas");
	}

}
