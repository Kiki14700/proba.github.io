package zad3;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class SortUzl {
	
	public static int[] genArrayInt(int n) {
		int [] niz = new int[n];

		for(int k = 0; k < n; k++) {
			niz[k] = ThreadLocalRandom.current().nextInt(0, 301);
		}

		return niz;

	}
	
	public static int[] sortUz(int[] niz) {
		
		Arrays.sort(niz);
		
		return niz;
		
	}
}
