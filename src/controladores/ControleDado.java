package controladores;

import java.util.ArrayList;
import java.util.List;

import model.dado.Dado;

public class ControleDado {

	private List<Dado> dados;
	
	private static ControleDado controleDado;
	
	private ControleDado() {
	}
	
	public static ControleDado getInstance(){
		if(controleDado == null)
			controleDado = new ControleDado();
		return controleDado;
	}
	
	public int lancarDados(){
		dados = new ArrayList<>();
		dados.add(new Dado(150,150));
		dados.add(new Dado(150,200));
		return dados.get(0).getFace() + dados.get(1).getFace();
	}
	
	public List<Dado> getDados() {
		return dados;
	}

	public int getValorDados() {
		return dados.get(0).getFace()+dados.get(1).getFace();
	}
	
}
