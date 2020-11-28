package zad2;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class MthMstr {
	
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
			if(maksi < niz[x]) {
				maksi = niz[x];
				x +=1;
			}else {
				x += 1;
			}
		}


		return maksi;
	}
	
	public static int getIndxMaks(int[] niz) {

		int maksi = niz[0];
		int indx = 0;
		int y = 1;

		while (y < niz.length) {
			if(maksi < niz[y]) {
				maksi = niz[y];
				indx = y;
				y +=1;
			}else {
				y += 1;
			}
		}

		return indx;
	}
	public static int[] swapMxFst(int[] niz) {
		long startTime = System.nanoTime();

		for (int k = 0; k < niz.length-1; k++) {
			int temp = niz[k];
			int mxi = returnMaksi(Arrays.copyOfRange(niz, k, niz.length));
			int indx = getIndxMaks(Arrays.copyOfRange(niz, k, niz.length))+k;
			niz[k] = mxi;
			niz[indx] = temp;

		}

		long stopTime = System.nanoTime();
		System.out.println("Elapsed time - swapMxFst algorithm: " + (stopTime - startTime));
		return niz;
	}
	public static int[] pushAlg(int[] niz) {
		long startTime = System.nanoTime();

		int temp;

		for(int p = 0; p < niz.length-1;p++) {
			for(int q = p+1; q < niz.length; q++) {

				if(niz[p] > niz[q]) {
					temp = niz[p];
					niz[p] = niz[q];
					niz[q] = temp;

				}

			}
		}

		long stopTime = System.nanoTime();
		System.out.println("Elapsed time - Push algorithm: " + (stopTime - startTime));
		return niz;
	}
	
}
