package controladores;

import dao.DAOJogador;
import interfaces.IteratorJogador;
import model.jogador.Jogador;

public class ControleJogador implements IteratorJogador {

	private static ControleJogador controleJogador;

	public static ControleJogador getInstance() {
		if (controleJogador == null)
			controleJogador = new ControleJogador();
		return controleJogador;
	}

	private ControleJogador() {
	}

	public void cadastrarJogador(String nome, String img) {
		DAOJogador.getInstance().addJogador(new Jogador(nome, img));
	}

	public void moverJogador(Jogador jogador, int dados) {
		int destino = ((jogador.getCasaAtual().getIndice() + dados));
		if (destino >= 100) {
			jogador.setCasaAtual(ControleCasas.getInstance().getCasas().get(99));
		} else
			jogador.setCasaAtual(ControleCasas.getInstance().getCasas().get(destino));
	}

	public Jogador proximoJogador(Jogador jogador, int qtdJogadores) {
		if (qtdJogadores == 2) {
			if (jogador == DAOJogador.getInstance().getJogadores().get(0))
				return (Jogador) DAOJogador.getInstance().getJogadores().get(1);
			else
				return (Jogador) DAOJogador.getInstance().getJogadores().get(0);
		}

		if (qtdJogadores == 3) {
			if (jogador == DAOJogador.getInstance().getJogadores().get(0))
				return (Jogador) DAOJogador.getInstance().getJogadores().get(1);
			else if (jogador == DAOJogador.getInstance().getJogadores().get(1))
				return (Jogador) DAOJogador.getInstance().getJogadores().get(2);
			else
				return (Jogador) DAOJogador.getInstance().getJogadores().get(0);
		}

		if (qtdJogadores == 4) {
			if (jogador == DAOJogador.getInstance().getJogadores().get(0))
				return (Jogador) DAOJogador.getInstance().getJogadores().get(1);
			else if (jogador == DAOJogador.getInstance().getJogadores().get(1))
				return (Jogador) DAOJogador.getInstance().getJogadores().get(2);
			else if (jogador == DAOJogador.getInstance().getJogadores().get(2))
				return (Jogador) DAOJogador.getInstance().getJogadores().get(3);
			else
				return (Jogador) DAOJogador.getInstance().getJogadores().get(0);
		}
		return null;
	}

	public Jogador getJogador(int numJogador) {
		return (Jogador) DAOJogador.getInstance().getJogadores().get(numJogador);
	}
}
