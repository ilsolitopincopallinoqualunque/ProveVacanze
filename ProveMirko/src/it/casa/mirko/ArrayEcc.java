package it.casa.mirko;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ArrayEcc {
	private static int x;

	static {
		System.out.println("\nIOsonoStatic x=" + x);
		x = 5;
	}

	private ArrayEcc() {
		System.out.println("\nIOsonocostruttore di default");
		x = 60;
	}

	public void provaForEach() {
		int[] interi = { 1, 2, 3, 4 };
		for (int element : interi) {
			System.out.println(element);
		}

		System.out.println("----\n");

	}

	/**
	 * 
	 */
	public void provaList() {
		// Creo una Lista di Integer: gli interi non si possono usare con le
		// collection
		//
		List<Integer> numeri = new ArrayList<>();
		numeri.add(1);
		numeri.add(2);
		numeri.add(2, 3);
		numeri.add(0, 10000);
		System.out.println(numeri.iterator());
		System.out.println(numeri.get(0));
		System.out.println("\n-----\n");
		Iterator i = numeri.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

		System.out.println("..ricarico iterator..");
		i = numeri.iterator();

		for (Integer integ : numeri) {
			System.out.println(integ + "   " + i.next());
		}
		System.out.println(i.hasNext());
		System.out.println("\n...uso piu iteratori sull stesso oggetto");
		Iterator i1 = numeri.iterator();
		Iterator i2 = numeri.iterator();
		System.out.println(i1.next());
		System.out.println(i1.next());
		// questo iteratore ora ricomincia da capo con l'elemento 0 della lista
		System.out.println(i2.next());
		// rimuovo l'ultimo elemento viistato da i1.next()
		i1.remove();

		// se ora col seconodo iteratore
		// dicessi di continuare le visite mi darebbe errore(fa un controllo se
		// altri iteratori sono stati modificati.

		System.out.println("rimosso 10000");

		// questo da errore
		// System.out.println(i2.next());
		
		System.out.println("qui ci arriviamo? Siii");
		System.out.println(i1.next());

	}

	public void provaMap() {
		Map<String, List<String>> persone = new HashMap<>();
		persone.put("mirko", new ArrayList<String>(Arrays.asList("MIRKO", "MEDONE", "13 giugno 1978")));
		persone.put("tiziana", new ArrayList<String>(Arrays.asList("TIZIAN", "Perrone", "26 marzo 1970")));

		System.out.println(persone.toString());
	}

	public static void main(String[] args) {

		// System.out.println(x+"\n----");
		//
		ArrayEcc view = new ArrayEcc();
		// view.provaForEach();
		// view.provaList();
		// System.out.println(x);
		view.provaMap();
		System.out.println("------------------------------");
		view.provaList();
	}

}
