package zad1;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Mathmaster {
	
	public static int[] genArrayInt(int n) {
		int [] niz = new int[n];

		for(int k = 0; k < n; k++) {
			niz[k] = ThreadLocalRandom.current().nextInt(0, 301);
		}

		return niz;
	}

	public static int returnMaksi(int [] niz) {

		int maksi = niz[0];
		int x = 1;

		while (x < niz.length) {
			if(maksi > niz[x]) {
				maksi = niz[x];
				x +=1;
			}else {
				x += 1;
			}
		}


		return maksi;
	}
	
	


}


