package no.hvl.dat100.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {

		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				System.out.print(matrise[i][j] + " ");
				{
				}
				System.out.println();
			}
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		String result = "";

		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				result += matrise[i][j];

				if (j < matrise[i].length - 1) {
					result += " ";
				}

			}
			result += " \n";
		}

		return result;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {

		int[][] nyMatrise = new int[matrise.length][matrise[0].length];

		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				nyMatrise[i][j] = matrise[i][j] * tall;
			}
		}
		return nyMatrise;

	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		
		if (a == null || b == null) {
			return false;
		}
		    	
		if (a.length != b.length) {
		    return false;
		}
		    
		  for (int i = 0; i < a.length; i++) {
		        if (a[i].length != b[i].length) {
		            return false;			
		        }
		  }
		    
		  for (int i = 0; i < a.length; i++) {
		        for (int j = 0; j < a[i].length; j++) {
		            if (a[i][j] != b[i][j]) {
		                return false;
		            }
		        }
		    }

		    return true;
	}
}
		