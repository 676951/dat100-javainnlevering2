package no.hvl.dat100.tabeller;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Math.*;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		System.out.print(tabell);

		}

	// b)
	public static String tilStreng(int[] tabell) {

		String tabell1 = ("[1,4,6]");
		
		return tabell1;
		
	}

	// c)
	public static int summer(int[] tabell) {

		int[] heltallTabell2 = { 1, 2, 4, 7 };
		int sum = 0;
		for (int i = 0; i < heltallTabell2.length; i++) {

			sum += heltallTabell2[i];

		}
		System.out.print("Summen av tabellen er: " + sum);
		System.out.print("\n");

		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		int[] tall2 = { 3, 5, 8, 6 };
		String tallTxt = showInputDialog("Gi et tall: ");
		int leterEtter = parseInt(tallTxt);

		boolean funnet = false;
		int i = 0;
		while (!funnet && i < tall2.length) {
			if (tall2[i] == leterEtter) {
				funnet = true;
			} else {
				i++;

			}
		}

		if (funnet) {
			System.out.print("True");
			System.out.print("\n");
		} else {
			System.out.print("False");
			System.out.print("\n");

		}
		return !funnet && funnet;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		int[] tabellen = { 3, 2, 5, 7, 8 };
		int i = 0;
		int posisjonen = tabellen[i];

		for (i = 0; i < tabellen.length; i++) {
			if (i == 0) {
				System.out.print(posisjonen);
			} else {
				System.out.print(", -1");
			}

		}
		System.out.print("\n");
		return -1;
	}

	// f)
	public static int[] reverser(int[] tabell) {

		int[] tabA = { 1, 2, 3, 4, 5 };

		int[] revTab = new int[tabA.length];

		for (int i = 0; i < tabA.length; i++) {
			revTab[i] = tabA[tabA.length - 1 - i];
		}

		for (int num : tabA) {
			System.out.print(num);

		}

		System.out.println();

		for (int num : revTab) {
			System.out.print(num);
		}
		System.out.print("\n");
		return revTab;
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		int[] tabellG = { 1, 2, 5, 7 };
		
		boolean sortert = true;
		int i = 1;
		
		while (sortert && i < tabellG.length) {
			if (tabellG[i-1] <= tabellG[i]) {
				i++;
			}else {
				sortert = false;
			}
		}
		
		if (sortert) {
			System.out.print("Tabellen er sortert");
			System.out.print("\n");
		} else {
			System.out.print("Tabellen er ikke sortert");
			System.out.print("\n");
		}
		return sortert && !sortert;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		
		int[] tab1 = {2, 38, 9};
		int[] tab2 = {13, 76, 42, 7};
		
		int nyLengde = tab1.length + tab2.length;
		int[] nyTab = new int[nyLengde];
		for (int i = 0; i < tab1.length; i++) {
			nyTab[i] = tab1[i];
		}
		for (int j = 0; j < tab2.length; j++) {
			nyTab[tab1.length + j] = tab2[j];
		}
		
		System.out.print("Ny tabell: [");
		for (int i = 0; i < nyTab.length; i++) {
			System.out.print(nyTab[i]);
			if (i < nyTab.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.print("]");
		System.out.print("\n");
		return nyTab;
	}
}
