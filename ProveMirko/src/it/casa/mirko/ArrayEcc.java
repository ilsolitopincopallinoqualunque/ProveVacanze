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

	public void provaList() {
		List<Integer> numeri = new ArrayList<>();
		numeri.add(1);
		numeri.add(2);
		numeri.add(2, 3);
		numeri.add(0, 10000);
		System.out.println(numeri.iterator());
		System.out.println(numeri.get(0));
		System.out.println("\n-----\n");
		Iterator i = numeri.iterator();
		System.out.println(i.next());
		System.out.println(i.next());
		System.out.println(i.next());
		i = numeri.iterator();
		System.out.println(i.next());
		System.out.println(i.next());
		System.out.println(i.next());

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
	}

}
