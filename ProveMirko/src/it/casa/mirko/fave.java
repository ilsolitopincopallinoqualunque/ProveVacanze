package it.casa.mirko;

class Fave extends Object {
	private String fava;

	public Fave(String fava) {
		super();
		System.out.println("Costruttore Fave(String)");
		this.fava = fava;
	}

	public Fave() {
		this("fava da mangiare");
		System.out.println("Costruttore fave default");
	}

	public void boh() {
		System.out.println(this.getClass());
	}

	public static void main(String[] args) {
		Fave favap = new Fave();
		favap.boh();
	}

}