package view;

import javax.swing.JOptionPane;
import Jplay.src.jplay.GameImage;
import Jplay.src.jplay.Keyboard;
import Jplay.src.jplay.Window;
import controladores.ControleDado;
import controladores.ControleJogador;
import controladores.ControleJogo;
import model.dado.Dado;
import model.jogador.Jogador;
import model.jogador.Pino;

public class View {
	private Window janela;
	private GameImage tabuleiro;
	private static Keyboard teclado;
	Jogador jogador = ControleJogador.getInstance().getJogador(0);
	private Jogador jogadorAtual;
	private int qtdJogador;
	
	public View(int qtdJogador) {
		this.qtdJogador = qtdJogador;
		tabuleiro = new GameImage("src/recursos/images/tabuleiro.png");
		this.janela = new Window(800, 528);
		teclado = janela.getKeyboard();
		setJogadorAtual(ControleJogador.getInstance().getJogador(0));
		run();
		
	}

	public void run() {
		janela.update();
		while (true) {
			janela.update();
			tabuleiro.draw();
			janela.update();
		
			for(int i = 0; i < qtdJogador; i++) {
				ControleJogador.getInstance().getJogador(i).getPino().draw();
			}
			
			/*
				ControleJogador.getInstance().getJogador1().getPino().draw();
				ControleJogador.getInstance().getJogador2().getPino().draw();
				ControleJogador.getInstance().getJogador3().getPino().draw();
				ControleJogador.getInstance().getJogador4().getPino().draw();
			*/
			

			updateJanela();
			ControleJogo.getInstance().proximaRodada(jogador);
			
			desenhaDado();
			updateJanela();
			
			jogador.getCasaAtual().acao(jogador);
			updateJanela();
			
			jogador = ControleJogador.getInstance().proximoJogador(jogador, qtdJogador);
			updateJanela();
		}
	}

	public void updateJanela() {
		janela.update();
	}

	public void proximaRodada() {
		while (true) {
			if (teclado.keyDown(Keyboard.ENTER_KEY)) {
				janela.setSize(800, 528);
			}
		}
	}

	public void mensagem(String mensagem) {
		JOptionPane.showMessageDialog(null, mensagem);
	}

	public void desenhaDado() {
		for (Dado d : ControleDado.getInstance().getDados()) {
			d.getImagemDado().draw();
			janela.update();
		}
		JOptionPane.showMessageDialog(null, "Avance "
				+ ControleDado.getInstance().getValorDados() + " casas");
	}

	public void moverJogador(Pino pino, Jogador jogador) {
		pino.draw();
		pino.moveTo(jogador.getCoordenada().getX(), jogador.getCoordenada()
				.getY(), 0.5);
	}

	public Jogador getJogadorAtual() {		
		return jogadorAtual;
	}

	public void setJogadorAtual(Jogador jogadorAtual) {
		this.jogadorAtual = jogadorAtual;
	}

	public void setQtdJogador(int qtdJogador) {
		this.qtdJogador = qtdJogador;
	}
}
