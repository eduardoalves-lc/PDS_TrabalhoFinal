package model.jogador;

import java.awt.Point;
import controladores.ControleCasas;
import model.casa.CasaTabuleiro;

public class Jogador {

	private String nome;
	private Pino pino;
	private CasaTabuleiro casaAtual;
	
	public Jogador(String nome, String img) {
		this.nome = nome;
		this.pino = new Pino(img);
		casaAtual = ControleCasas.getInstance().getCasas().get(0);
	}
	
	public String getNome() {
		return nome;
	}
	
	public Pino getPino() {
		return pino;
	}
	
	public CasaTabuleiro getCasaAtual(){
		return casaAtual;
	}
	
	public Point getCoordenada(){
		return casaAtual.getCoordenada();
	}

	public void setCasaAtual(CasaTabuleiro casaAtual) {
		this.casaAtual = casaAtual;
		pino.x = casaAtual.getCoordenada().getX();
		pino.y = casaAtual.getCoordenada().getY();
	}
	
}
