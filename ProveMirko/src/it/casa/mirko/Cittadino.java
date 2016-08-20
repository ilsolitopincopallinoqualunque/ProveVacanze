package it.casa.mirko;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Cittadino extends Uomo {

	private String codiceFiscale;

	public Cittadino() {
		// super(); //posso usare questo per chiamare il costruttore di Uomo();
		// this.codiceFiscale="MDNMRK78H13E560p"; //oppure si chiama il
		// costruttore specifico
		this("MDNMRK78H13E560p");

		System.out.println("Costruttore di Cittadino()" + getNome() + " " + getNumeroDiPalle() + " " + codiceFiscale);
	}

	public Cittadino(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
		System.out.println(
				"Costruttore di Cittadino(String C.F.)" + getNome() + " " + getNumeroDiPalle() + " " + codiceFiscale);

	}

	public Cittadino(String nome, String codiceFiscale) {
		super(nome);
		this.codiceFiscale = codiceFiscale;
		System.out.println("Costruttore di Cittadino(String Uomo(nome),String C.F.)" + getNome() + " "
				+ getNumeroDiPalle() + " " + codiceFiscale);

	}

	protected void finalize() throws Throwable {
		System.out.println("distruttore Padre");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
//	@Override
//	public String toString() {
//		return "Sono un Cittadino \nOggetto: " + super.toString() + " con CF" + codiceFiscale;
//
//	}

	public static void main(String[] args) {

		System.out.println("main di Cittadino");
		Cittadino cittadino = new Cittadino();
		System.out.println("--------------------------------------");
		Cittadino cittadino2 = new Cittadino("Mirko", "MDNMRKeccetera");
		String t=cittadino.toString();
		System.out.println(t);
		System.out.println("\n----------------------------------------\n"+cittadino2);
	}

}

// Classe che padre

class Uomo {
	private String nome;
	
	private final int NUMERO_DI_PALLE = 2;

	public Uomo() {
		this("Pinco Pallino");
		System.out.println("Costruttore di Uomo()" + getNome() + " " + getNumeroDiPalle());
	}

	public Uomo(String nome) {
		this.nome = nome;
		
//		System.out.println("Costruttore di Uomo(String nome)" + getNome() + " " + getNumeroDiPalle());

	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome
	 *            the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the NUMERO_DI_PALLE
	 */
	public int getNumeroDiPalle() {
		return NUMERO_DI_PALLE;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "sono un uomo\noggetto: "+super.toString() + " " + nome + NUMERO_DI_PALLE;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#finalize()
	 */
	@Override
	protected void finalize() throws Throwable {
		System.out.println("distruttore \"finalize\" di Uomo "+this.getClass().getName());
		super.finalize();
	}

	public static void main(String[] args) throws IOException {
		System.out.println("Main di Uomo");
		Uomo uomo = new Uomo();
		System.out.println(uomo);
		for(int i=0;i<10000;i++){uomo=new Uomo();}
		BufferedReader scanner=new BufferedReader(new InputStreamReader(System.in));
		scanner.readLine();
		System.out.println(uomo);
		scanner.readLine();
	}

}
