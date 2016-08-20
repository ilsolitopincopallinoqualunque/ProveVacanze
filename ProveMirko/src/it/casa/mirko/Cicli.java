package it.casa.mirko;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cicli {
	private String[] stringa = { "mirko", "1", "medone", "mangia", "bidone", "5" };

	public void getprint() {
		for (int i = 0; i <= 5; i++) {
			if (i == 1) {
				System.out.println("if (i ==1) continue;");
				continue;
			}
			if (i == 5) {
				System.out.println("else if (i ==5) break;");
				break;
			}
			System.out.println(stringa[i]);
		}
	}

	public void getprint2() {
		for (String s : stringa) {

			System.out.println(s);
		}
	}

	public void getSwitch(Integer i) {
		switch (i) {
		case 1:
			System.out.println("--1");
			break;
		case 2:
			System.out.println("--2");
			break;
		}
	}

	public static void main(String[] args) {
		for(String a:args){
			System.out.println("Argomento: "+a);
		}
		Cicli cicli = new Cicli();
		cicli.getSwitch(2);
		int car;
		String stringa="";
		double numero=0;
		BufferedReader console=new BufferedReader(new InputStreamReader(System.in));
		
		
		
		System.out.print("dammi un numero e premi invio >");
		
		try {
			stringa= console.readLine();
			numero=Double.parseDouble(stringa);
		} 
		catch (NumberFormatException n){
			System.out.println("non e' un numero! :-(");
			
		}
		 
		catch (IOException e) {
			System.out.println("CAzzi TUOI");
			e.printStackTrace();
		}
		System.out.println("il numero inserito e' "+numero);
	}

}
