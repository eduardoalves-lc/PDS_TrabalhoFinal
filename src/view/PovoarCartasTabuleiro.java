package view;

import dao.DAOCartas;
import fabrica.FabricaCartasTabuleiro;

public class PovoarCartasTabuleiro {

	public PovoarCartasTabuleiro() {
		FabricaCartasTabuleiro fabricaCartas = new FabricaCartasTabuleiro();
		
		DAOCartas.getInstance().addCarta(fabricaCartas.criar("S", 8, "Casa da Sorte!! Avance 8 casas! "));
		DAOCartas.getInstance().addCarta(fabricaCartas.criar("S", 4, "Casa da Sorte!! Avance 4 casas! "));
		DAOCartas.getInstance().addCarta(fabricaCartas.criar("S", 10, "Casa da Sorte!! Avance 10 casas! "));
		DAOCartas.getInstance().addCarta(fabricaCartas.criar("S", 7, "Casa da Sorte!! Avance 7 casas! "));
		DAOCartas.getInstance().addCarta(fabricaCartas.criar("A", 5, "Deu Azar, ein!! Volte 5 casas! "));
		DAOCartas.getInstance().addCarta(fabricaCartas.criar("A", 8, "Deu Azar, ein!! Volte 8 casas! "));
		DAOCartas.getInstance().addCarta(fabricaCartas.criar("A", 10, "Deu Azar, ein!! Volte 10 casas! "));
		DAOCartas.getInstance().addCarta(fabricaCartas.criar("A", 3, "Deu Azar, ein!! Volte 3 casas! "));
		DAOCartas.getInstance().addCarta(fabricaCartas.criar("A", 20, "Deu Azar, ein!! Volte 20 casas! "));
	}
	
	
}
