package controladores;

import java.util.Random;

import dao.DAOCartas;
import interfaces.IEfeito;
import interfaces.IteratorCartas;

public class ControleCartas implements IteratorCartas{

private static ControleCartas controleCartas;
	
	private ControleCartas(){		
	}
	
	public static ControleCartas getInstance(){
		if(controleCartas == null)
			controleCartas = new ControleCartas();
		return controleCartas;
	}
	
	@Override
	public IEfeito proximaCarta() {
		int tamanho = DAOCartas.getInstance().getCartas().size();
		return DAOCartas.getInstance().getCartas().get(new Random().nextInt(tamanho));
	}
	
}
