package controladores;

import javax.swing.JOptionPane;
import dao.DAOCasas;
import dao.DAOJogador;
import interfaces.IJogo;
import model.jogador.Jogador;
import view.View;

public class ControleJogo implements IJogo {
	private static ControleJogo controleJogo;
	private int qtdJogador;

	public ControleJogo() {
	}

	public static ControleJogo getInstance() {
		if (controleJogo == null) {
			controleJogo = new ControleJogo();
		}
		return controleJogo;
	}

	public void iniciarJogo() {
		DAOCasas.getInstance();
		this.qtdJogador = (Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas participantes irão jogar: ")));
		for (int i = 1; i <= qtdJogador; i++) {
			cadastrarJogador("src/recursos/images/pino" + i + ".png");
		}

		mostrarJogadores();
		new View(qtdJogador);
	}

	@Override
	public void proximaRodada(Jogador jogador) {
		JOptionPane.showMessageDialog(null, jogador.getNome() + ". Sua vez de jogar");
		lancarDado();
		moverJogador(jogador, ControleDado.getInstance().getValorDados() - 1);
	}

	public void moverJogador(Jogador jogador, int dados) {
		ControleJogador.getInstance().moverJogador(jogador, dados);
	}

	public void mostrarJogadores() {

		switch (qtdJogador) {
		case 2:
			JOptionPane.showMessageDialog(null, ControleJogador.getInstance().getJogador(0).getNome()
					+ " - Pino Preto\n" + ControleJogador.getInstance().getJogador(1).getNome() + " - Pino Vermelho\n");
			break;
		case 3:
			JOptionPane.showMessageDialog(null,
					ControleJogador.getInstance().getJogador(0).getNome() + " - Pino Preto\n"
							+ ControleJogador.getInstance().getJogador(1).getNome() + " - Pino Vermelho\n"
							+ ControleJogador.getInstance().getJogador(2).getNome() + " - Pino Verde\n");
			break;
		case 4:
			JOptionPane.showMessageDialog(null,
					ControleJogador.getInstance().getJogador(0).getNome() + " - Pino Preto\n"
							+ ControleJogador.getInstance().getJogador(1).getNome() + " - Pino Vermelho\n"
							+ ControleJogador.getInstance().getJogador(2).getNome() + " - Pino Verde\n"
							+ ControleJogador.getInstance().getJogador(3).getNome() + " - Pino Azul\n");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Número inválido!");
			break;
		}
	}

	@Override
	public void cadastrarJogador(String pino) {
		DAOJogador.getInstance().addJogador(new Jogador(JOptionPane.showInputDialog("Digite seu nome"), pino));
	}

	@Override
	public int lancarDado() {
		return ControleDado.getInstance().lancarDados();
	}

	public void Mensagem(String mensagem) {
		JOptionPane.showMessageDialog(null, mensagem);
	}
	
}
