package model.cartas;

import interfaces.IEfeito;

public abstract class Carta implements IEfeito{

	private int valor;
	private String descricao;
	
	public Carta(int valor, String descricao) {
		this.valor = valor;
		this.descricao = descricao;
	}
	
	public int getValor() {
		return valor;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
}
