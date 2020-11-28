package zad2;

import java.util.Arrays;

import zad1.Mathmaster;

public class Main {
	public static void main(String[] args) {
		
		int mx;
		int indx;

		int [] niz = MthMstr.genArrayInt(10);
		

		mx = MthMstr.returnMaksi(niz);
		indx = MthMstr.getIndxMaks(niz);
		System.out.println("Array: ");
		System.out.println(Arrays.toString(niz));
		System.out.println("Max: " + mx);
		System.out.println("Indx position of the max in original array: " + indx);
		System.out.println("Sorted generated array: ");
		System.out.println(Arrays.toString(MthMstr.swapMxFst(niz)));

		int[] nar = {28,11,44,12,89,33};
		int [] ari = MthMstr.swapMxFst(nar);

		System.out.println("Sorted: ");
		System.out.println(Arrays.toString(ari));
		
		System.out.println("Sorted: ");
		System.out.println(Arrays.toString(MthMstr.pushAlg(niz)));
	}
	

}
