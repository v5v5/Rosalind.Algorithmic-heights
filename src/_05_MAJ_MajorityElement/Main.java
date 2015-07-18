package _05_MAJ_MajorityElement;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Data.DataMAJ data = new Data.DataMAJ();

		Data.getData(data);

//		System.out.println("----- data in -----");		
//		System.out.println("k: " + data.k);
//		System.out.println("n: " + data.n);
//		for (int i = 0; i < data.k; i++) {
//			System.out.println(Arrays.toString(data.a[i]));
//		}

		int[] dataOut = Algorithms.majorityElement(data);

		System.out.println("----- data out -----");		
		System.out.println(Arrays.toString(dataOut));
	}

}
