package dao;

import java.util.ArrayList;

import model.cartas.Carta;

public class DAOCartas {

	private ArrayList<Carta> cartas;
	private static DAOCartas daoCartas;
	
	public DAOCartas() {
		cartas = new ArrayList<Carta>();
	}
	
	public static DAOCartas getInstance() {
		if(daoCartas == null) {
			daoCartas = new DAOCartas();
		}
		return daoCartas;
	}
	
	public void addCarta(Carta carta) {
		cartas.add(carta);
	}
	
	public ArrayList<Carta> getCartas(){
		return cartas;
	}
	
}
