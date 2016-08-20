package it.casa.mirko;

public class Eredita extends Fave {
	private String eredita;

	public Eredita(String fava) {
//		super(fava);
		System.out.println("Costruttore Eredita(string)");
	}

	public Eredita(String fava, String eredita) {
		this(eredita);
		System.out.println("Costruttore Eredita(String,String)");
		this.eredita = eredita;
	}

	public Eredita() {
		super();
		System.out.println("Costruttore Eredita() default");
	}

	public static void main(String[] args) {
		Eredita prova = new Eredita();
		prova.boh();
		
		Eredita prova2 = new Eredita("fava", "eredita");
		
		int[] a = { 1, 2, 3, 4, 5 };

		for (int i : a) {
			System.out.println(i);

		}
	}

}

// ----altra classe

class Main {

}
