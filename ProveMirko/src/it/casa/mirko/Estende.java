package it.casa.mirko;

import it.casa.mirko.esterno.Modificatori;

public class Estende extends Modificatori{
	ClasseNondelFile classeNondelFile = new ClasseNondelFile();
	
	public Estende() {
		System.out.println("Costruttore CILCI");
	}

	public static void main(String[] args) {
		Estende cicli= new Estende();
		System.out.println(ClasseNondelFile.y);
		System.out.println(cicli.classeNondelFile.x);
		ClasseNondelFile classeNondelFile= new ClasseNondelFile();
		

	}
}
 class ClasseNondelFile {
		public int x;
		public static final int y;

		 static{
		 System.out.println("inizializzazione di Y");
		 y=5;
		 }
		public ClasseNondelFile() {
			x = 122;
			System.out.println("costruttore ClasseNondelFile ");
		}
		private void privato(){
			System.out.println("metodoprivatoDellaClasenonFile");
		}

	}

 

