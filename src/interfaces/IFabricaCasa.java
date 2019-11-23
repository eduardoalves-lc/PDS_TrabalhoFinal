package interfaces;

import java.awt.Point;

public interface IFabricaCasa <T>{

	T criar (int i, String tipo, Point p);
	T criar (int i, String tipo, Point p, int destino);
	
}
