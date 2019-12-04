package fabrica;

import java.awt.Point;
import interfaces.IFabricaCasa;
import model.casa.CasaEspecial;
import model.casa.CasaFinal;
import model.casa.CasaMussum;
import model.casa.CasaNormal;
import model.casa.CasaSubida;
import model.casa.CasaTabuleiro;

public class FabricaCasaTabuleiro implements IFabricaCasa<CasaTabuleiro> {
	
	CasaTabuleiro casa = null;
	
	@Override
	public CasaTabuleiro criar(int i, String tipo, Point p, int valor) {
		
		if (tipo.equals("S")) {
			casa = new CasaSubida(i, p, valor);
		} else if(tipo.equals("M")) {
			casa = new CasaMussum(i, p, valor);
		} 
		return casa;
	}

	@Override
	public CasaTabuleiro criar(int i, String tipo, Point p) {
		if(tipo.equals("N")) {
			casa = new CasaNormal(i, p);
		} else if(tipo.equals("F")) {
			casa = new CasaFinal(i, p);
		} else if(tipo.equals("E")){
			casa = new CasaEspecial(i, p);
		}
		return casa;
	}

}
