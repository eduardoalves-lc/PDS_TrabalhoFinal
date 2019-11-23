package interfaces;

import model.jogador.Jogador;

public interface IJogo {

	public void iniciarJogo();
	public void proximaRodada(Jogador jogador);
	public int lancarDado();
	public void cadastrarJogador(String pino);
	
}
