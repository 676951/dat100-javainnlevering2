package no.hvl.dat100.tabeller;

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
		
		String[] tabellB = {"[42, ","67, ","89]"};
		for (String tall : tabellB)
		System.out.print(tall);
		System.out.print("\n");
		
		return null;
		
	}

	// c)
	public static int summer(int[] tabell) {

		int[] heltallTabell2 = {1,2,4,7};
		int sum = 0;
		for (int i = 0; i<=4; i++) {
			
			sum+= heltallTabell2[i];
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
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
