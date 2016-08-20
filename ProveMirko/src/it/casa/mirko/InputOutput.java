package it.casa.mirko;

import it.casa.mirko.esterno.*;

public class InputOutput extends Modificatori{
 private int y;
 	
	@Override
public int getX() {
	return Modificatori.x;	
	//return super.x;
}

	public static void main(String[] args) {
		InputOutput prova=new InputOutput();
		System.out.println("inputOutput "+Modificatori.x);
		System.out.println("get int X :"+prova.getX());

	}

}
