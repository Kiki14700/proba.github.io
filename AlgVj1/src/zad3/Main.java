package zad3;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		
		int[] niz = SortUzl.genArrayInt(10);
		
		System.out.println("Uzlazno sortirani niz: ");
		System.out.println(Arrays.toString(SortUzl.sortUz(niz)));
	}

}
