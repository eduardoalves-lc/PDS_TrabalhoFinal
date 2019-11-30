package controladores;

import javax.swing.JOptionPane;

import dao.DAOCasas;
import dao.DAOJogador;
import interfaces.IJogo;
import model.jogador.Jogador;
import view.View;

public class ControleJogo implements IJogo {

	private static ControleJogo controleJogo;
	int qtdjogador;
	
	public ControleJogo() {
	}
	
	public static ControleJogo getInstance() {
		if(controleJogo == null) {
			controleJogo = new ControleJogo();
		}
		return controleJogo;
	}
	
	public void iniciarJogo() {
		DAOCasas.getInstance();
		cadastrarJogador("src/recursos/images/pino1.png");
		cadastrarJogador("src/recursos/images/pino2.png");
		cadastrarJogador("src/recursos/images/pino3.png");
		cadastrarJogador("src/recursos/images/pino4.png");
		JOptionPane.showMessageDialog(null, ControleJogador.getInstance().getJogador1().getNome()+" - Pino Preto\n"+
				ControleJogador.getInstance().getJogador2().getNome()+" - Pino Laranja\n"+
				ControleJogador.getInstance().getJogador3().getNome()+" - Pino Verde\n"+
				ControleJogador.getInstance().getJogador4().getNome()+" - Pino Vermelho\n");
		new View();	
	}

	@Override
	public void proximaRodada(Jogador jogador) {
		JOptionPane.showMessageDialog(null,jogador.getNome()+". Sua vez de jogar");
		lancarDado();
		moverJogador(jogador, ControleDado.getInstance().getValorDados()-1);	
	}

	public void moverJogador(Jogador jogador, int dados){
		ControleJogador.getInstance().moverJogador(jogador, dados);
	}

	@Override
	public void cadastrarJogador(String pino) {
		JOptionPane.showInputDialog("Quantos jogadores irão participar: ", qtdjogador);
		System.out.println(qtdjogador);
		DAOJogador.getInstance().addJogador(
				new Jogador(JOptionPane.showInputDialog("Digite seu nome"), pino));		
	}
	
	@Override
	public int lancarDado() {
		return ControleDado.getInstance().lancarDados();
	}

	public int getQtdjogador() {
		return qtdjogador;
	}

	public void setQtdjogador(int qtdjogador) {
		this.qtdjogador = qtdjogador;
	}

	public void Mensagem(String mensagem) {
		JOptionPane.showMessageDialog(null, mensagem);
	}
}
