package dao;

import java.util.ArrayList;

import model.jogador.Jogador;

public class DAOJogador {

	private static DAOJogador daoJogadores;
	private ArrayList<Jogador> jogadores;
	
	public DAOJogador() {
		jogadores = new ArrayList<Jogador>();
	}
	
	public static DAOJogador getInstance() {
		if( daoJogadores == null ) {
			daoJogadores = new DAOJogador();
		}
		return daoJogadores;
	}
	
	public void addJogador(Jogador jogador) {
		this.jogadores.add(jogador);
	}
	
	public void removerJogador(Jogador jogador) {
		this.jogadores.remove(jogador);
	}
	
	public ArrayList<Jogador> getJogadores(){
		return jogadores;
	}
	
}
