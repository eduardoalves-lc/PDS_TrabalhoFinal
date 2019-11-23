package model.cartas;

import controladores.ControleCasas;
import controladores.ControleJogo;
import model.jogador.Jogador;

public class CartaAzar extends Carta {

	public CartaAzar(int valor, String descricao) {
		super(valor, descricao);
	}

	@Override
	public void acao(Jogador jogador) {
		int casaAtual = jogador.getCasaAtual().getIndice();
		jogador.setCasaAtual(ControleCasas.getInstance().getCasas().get((casaAtual-1) - this.getValor()));
		ControleJogo.getInstance().Mensagem(this.getDescricao());

	}

	
}
