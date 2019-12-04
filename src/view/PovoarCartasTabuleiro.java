package view;

import dao.DAOCartas;
import fabrica.FabricaCartasTabuleiro;

public class PovoarCartasTabuleiro {

	public PovoarCartasTabuleiro() {
		FabricaCartasTabuleiro fabricaCartas = new FabricaCartasTabuleiro();

		DAOCartas.getInstance().addCarta(fabricaCartas.criar("S", 3, "Casa da Sorte!! Avance 3 casas! "));
		DAOCartas.getInstance().addCarta(fabricaCartas.criar("S", 2, "Casa da Sorte!! Avance 2 casas! "));
		DAOCartas.getInstance().addCarta(fabricaCartas.criar("S", 1, "Casa da Sorte!! Avance 1 casas! "));
		DAOCartas.getInstance().addCarta(fabricaCartas.criar("A", 2, "Deu Azar, ein!! Volte 2 casas! "));
		DAOCartas.getInstance().addCarta(fabricaCartas.criar("A", 1, "Deu Azar, ein!! Volte 1 casas! "));
		DAOCartas.getInstance().addCarta(fabricaCartas.criar("A", 3, "Deu Azar, ein!! Volte 3 casas! "));
	}
	
}
