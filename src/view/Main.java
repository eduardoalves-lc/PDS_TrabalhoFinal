package view;

import controladores.ControleJogo;

public class Main {

	public static void main(String[] args) {
		PovoarCasasTabuleiro povoarTabuleiro = new PovoarCasasTabuleiro();
		PovoarCartasTabuleiro povoarCartas = new PovoarCartasTabuleiro();
		ControleJogo.getInstance().iniciarJogo();
	}
	
}
