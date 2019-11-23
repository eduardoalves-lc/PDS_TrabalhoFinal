package fabrica;

import interfaces.IFabricaCarta;
import model.cartas.Carta;
import model.cartas.CartaAzar;
import model.cartas.CartaSorte;

public class FabricaCartasTabuleiro implements IFabricaCarta{

	@Override
	public Carta criar(String tipo, int valor, String descricao) {
		
		Carta carta = null;
		
		if (tipo.equals("S")) {
			carta = new CartaSorte(valor, descricao);
		} else if (tipo.equals("A")) {
			carta = new CartaAzar(valor, descricao);
		}
		return carta;
	}	
	
}
