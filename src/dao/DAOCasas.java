package dao;

import java.util.ArrayList;

import model.casa.CasaTabuleiro;

public class DAOCasas {

	private static DAOCasas tabuleiro;
	private ArrayList<CasaTabuleiro> casas;
	
	public DAOCasas() {
		casas = new ArrayList<CasaTabuleiro>();
	}
	
	public static DAOCasas getInstance() {
		if(tabuleiro == null) {
			tabuleiro = new DAOCasas();
		}
		return tabuleiro;
	}
	
	public void addCasa(CasaTabuleiro casa) {
		casas.add(casa);
	}
	
	public ArrayList<CasaTabuleiro> getCasas(){
		return casas;
	}
	
}
