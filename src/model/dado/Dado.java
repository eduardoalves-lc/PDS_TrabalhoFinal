package model.dado;

import jplay.Animation;

public class Dado {
	
	private static final int max = 6;
	private Animation imagemDado;
	private int face;
	
	public Dado(int x, int y) {
		imagemDado = new Animation("src/recursos/images/Dado.png", 6);
		imagemDado.x = x;
		imagemDado.y = y;
		lancar();
	}
	
	private void lancar(){
		int valor = (int) (Math.random() * max);
		imagemDado.setCurrFrame(valor);
		face = valor + 1;
	}
	
	public Animation getImagemDado(){
		return imagemDado;
	}
	
	public int getFace(){
		return face;
	}
}
