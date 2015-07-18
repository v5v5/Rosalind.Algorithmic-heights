package _07_2SUM;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Data.Data2SUM data = new Data.Data2SUM();
		Data.getData(data);

		System.out.println("----- data in -----");
		System.out.println("k: " + data.k);
		System.out.println("n: " + data.n);
		for (int i = 0; i < data.k; i++) {
			System.out.println(Arrays.toString(data.a[i]));
		}

		int[][] dataOut = Algorithms._2sum(data);

		System.out.println("----- data out -----");
		for (int i = 0; i < dataOut.length; i++) {
			System.out.println(Arrays.toString(dataOut[i]));
		}

	}

}
