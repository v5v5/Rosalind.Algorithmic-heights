package _07_2SUM;

import _07_2SUM.Data.Data2SUM;

public class Algorithms {

	public static int[][] _2sum(Data2SUM data) {
		int[][] out = new int[data.k][];

		external: for (int i = 0; i < data.a.length; i++) {
			for (int j = 0; j < data.a[i].length; j++) {
				for (int k = j + 1; k < data.a[i].length - 1; k++) {
					if (data.a[i][j] == -data.a[i][k]) {
						out[i] = new int[2];
						out[i][0] = j + 1;
						out[i][1] = k + 1;
						continue external;
					}
				}
			}

			out[i] = new int[1];
			out[i][0] = -1;
		}

		return out;
	}

}
