package interfaces;

import model.cartas.Carta;

public interface IFabricaCarta {

	public Carta criar(String tipo, int valor, String descricao);
	
}
