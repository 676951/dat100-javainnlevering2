package no.hvl.dat100.tabeller;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;


public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		int[] heltallTabell = {1,2,4,7};
		for (int i = 0; i <= 4; i++) {
			int v = heltallTabell[i];
			
			if (i > 0) {
				System.out.print(", ");
				
			}
		
			System.out.print(v);
	
			
		}
	}
	
	// b)
	public static String tilStreng(int[] tabell) {
<<<<<<< HEAD
		
		String[] tabellB = {"[42, ","67, ","89]"};
		for (String tall : tabellB)
=======
		String[] tabell1 = {"[42, ","67, ","89]"};
		for (String tall : tabell1)
			
>>>>>>> f5291fec13e6fd6561b67c6698eaf32d3f8ea511
		System.out.print(tall);
		System.out.print("\n");
		
		return null;
		
	}

	// c)
	public static int summer(int[] tabell) {

		int[] heltallTabell2 = {1,2,4,7};
		int sum = 0;
<<<<<<< HEAD
		for (int i = 0; i<=4; i++) {
			
			sum+= heltallTabell2[i];
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
=======
		for (int i = 0; i < heltallTabell2.length; i++) {
			
			sum += heltallTabell2[i];
			
			}
		System.out.print("Summen av tabellen er: " + sum);
		System.out.print("\n");
			
		return sum;
>>>>>>> f5291fec13e6fd6561b67c6698eaf32d3f8ea511
	}
	

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		int [] tall2 = {3, 5, 8, 6};
		String tallTxt = showInputDialog("Gi et tall: ");
		int leterEtter = parseInt(tallTxt);
		
		
		boolean funnet = false;
		int i = 0;
		while ( !funnet && i < tall2.length) {
			if (tall2[i] == leterEtter) {
				funnet = true;
			}else {
				i++;
				
			}
		}
		
	if (funnet) {
		System.out.print("True");
		System.out.print("\n");
	}else {
		System.out.print("False");
		System.out.print("\n");
		
		}
	return !funnet && funnet;
	}
	

		


		
		

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		// TODO
		throw new UnsupportedOperationException("Metoden posisjonTall ikke implementert");
	}

	// f)
	public static int[] reverser(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden reverser ikke implementert");
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden erSortert ikke implementert");
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		throw new UnsupportedOperationException("Metoden settSammen ikke implementert");

	}
}
