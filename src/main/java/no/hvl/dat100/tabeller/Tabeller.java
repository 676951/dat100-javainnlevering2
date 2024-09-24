package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		int[] heltallTabell = {1,2,4,7};
		for (int i = 0; i <= 4; i++) {
			int v = heltallTabell[i];
			
			if (i < heltallTabell.length - 1) {
				System.out.print(", ");
				
			}
		
			System.out.print(v);
			
		}
		}
	
	// b)
	public static String tilStreng(int[] tabell) {
		
		int[] tabell2 = {42, 67, 89};
		int[] utskrift = tabell2;
		
		
		
		for (int j = 0; j < tabell2.length; j++) {
			int w = tabell2[j];
			

			System.out.print(utskrift);
			
			if ( j < tabell2.length -1) {
				System.out.print(", ");
				
			}

		}
		
		System.out.print("]");
		return "";
		

		
	}

	// c)
	public static int summer(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden summer ikke implementert");
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		// TODO
		throw new UnsupportedOperationException("Metoden finnesTall ikke implementert");

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
