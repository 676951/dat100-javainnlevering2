package no.hvl.dat100.tabeller;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Math.*;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		String outputA = "";

		for (int i = 0; i < tabell.length; i++) {
			int v = tabell[i];

			if (i > 0) {
				outputA += ", ";

			}

			outputA += v;

		}

		System.out.println("Oppgave A: " + outputA);

	}

	// b)
	public static String tilStreng(int[] tabell) {

		String outputB = "[";

		for (int i = 0; i < tabell.length; i++) {
			outputB += tabell[i];

			if (i < tabell.length - 1) {
				outputB += ",";
			}
		}

		outputB += "]";

		System.out.println("Oppgave B: " + outputB);
		return outputB;

	}

	// c)
	public static int summer(int[] tabell) {

		int sum = 0;
		for (int i = 0; i < tabell.length; i++) {

			sum += tabell[i];

		}
		System.out.println("Oppgave C: " + sum);

		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		boolean funnet = false;
		int i = 0;

		while (!funnet && i < tabell.length) {
			if (tabell[i] == tall) {
				funnet = true;
			} else {
				i++;

			}

		}
		System.out.println("Oppgave D: " + funnet);
		return funnet;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		for (int posisjon = 0; posisjon < tabell.length; posisjon++) {
			if (tabell[posisjon] == tall) {
				System.out.println("Oppgave E: " + posisjon);
				return posisjon;
			}

		}
		System.out.println("Oppgave E: -1");
		return -1;
	}

	// f)
	public static int[] reverser(int[] tabell) {

		int[] revTab = new int[tabell.length];

		for (int i = 0; i < tabell.length; i++) {
			revTab[i] = tabell[tabell.length - 1 - i];
		}

		System.out.println("Oppgave F: " + finTekst(revTab)); 
		return revTab;
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		for (int i = 1; i < tabell.length; i++) {
			if (tabell[i] < tabell[i - 1]) {
				System.out.println("Oppgave G: Tabellen er ikke sortert");
				return false;
			}
		}
		System.out.println("Oppgave G: Tabellen er sortert");
		return true;


	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int[] tabell3 = new int[tabell1.length + tabell2.length];

		for (int i=0; i<tabell1.length;i++) {
			tabell3[i]=tabell1[i];
		}
		for (int i=0; i<tabell2.length;i++) {
			tabell3[i+tabell1.length]=tabell2[i];
		}

		System.out.println("Oppgave H: " + finTekst(tabell3));
		return tabell3;

	}
	
	// Lager en metode for å printe hele tabellen (gjør det samme som oppgave b)
		public static String finTekst(int[] tabell) {
			String tabellFin = "[";
			for (int i = 0; i < tabell.length; i++) {
				tabellFin += tabell[i];
				if (i < tabell.length - 1) {
					tabellFin += ",";
				}
			}
			tabellFin += "]";
			return tabellFin;
		}
}
