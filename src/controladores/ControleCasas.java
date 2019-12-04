package controladores;

import java.util.ArrayList;
import dao.DAOCasas;
import model.casa.CasaTabuleiro;

public class ControleCasas {

	private static ControleCasas controleCasas;
	
	private ControleCasas() {
	}
	
	public static ControleCasas getInstance(){
		if(controleCasas == null)
			controleCasas = new ControleCasas();
		return controleCasas;
	}
	
	public void addCasa(CasaTabuleiro casa) {
		DAOCasas.getInstance().addCasa(casa);
	}
	
	public ArrayList<CasaTabuleiro> getCasas(){
		return DAOCasas.getInstance().getCasas();
	}
	
}
